package com.example.demo;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.mybatis")
public class SpringMyBatisApplication {
	@Autowired
	TysService tysService;
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		JSONArray jsonArray = new JSONArray();
		List<TysMember> tysMemberList = tysService.selectMember();
		for(TysMember tysMember : tysMemberList) {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("S_MEMBER_NM", tysMember.getS_member_nm());
			jsonObject.put("V_BIRTH", tysMember.getV_birth());
			jsonObject.put("V_DESC", tysMember.getV_desc());
			jsonObject.put("V_NO", tysMember.getV_no());
			jsonObject.put("V_TEAM", tysMember.getV_team());
			jsonObject.put("V_MEMBER_NM", tysMember.getvMemberNm());
			jsonObject.put("V_POSITION", tysMember.getvPosition());
			jsonArray.add(jsonObject);
		}
		System.out.println(jsonArray.toJSONString());
		return jsonArray.toJSONString();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMyBatisApplication.class, args);
	}
}
