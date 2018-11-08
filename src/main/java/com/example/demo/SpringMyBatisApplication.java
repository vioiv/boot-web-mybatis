package com.example.demo;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParser;

@Controller
@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.mybatis")
public class SpringMyBatisApplication extends SpringBootServletInitializer {
	@Autowired
	TysService tysService;
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		JSONArray jsonArray = new JSONArray();
		List<TysMember> tysMemberList = tysService.selectMember();
		for(TysMember tysMember : tysMemberList) {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("v_no", tysMember.getV_no());
			jsonObject.put("s_member_id", tysMember.getS_member_id());
			jsonObject.put("v_member_nm", tysMember.getV_member_nm());
			jsonObject.put("v_birth", tysMember.getV_birth());
			jsonObject.put("position_nm", tysMember.getPosition_nm());
			jsonObject.put("position_cd", tysMember.getPosition_cd());
			jsonObject.put("v_desc", tysMember.getV_desc());
			jsonArray.add(jsonObject);
		}
		System.out.println(jsonArray.toJSONString());
		return jsonArray.toJSONString();
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	void homeInsert(@RequestBody String requestBody) throws ParseException {
		JSONObject jsonObject = new JSONObject();
		JSONParser jsonParser = new JSONParser();
		jsonObject = (JSONObject)jsonParser.parse(requestBody);
		
		TysMember tysMember = new TysMember();
		tysMember.setV_no(jsonObject.get("v_no").toString());
		tysMember.setS_member_id(jsonObject.get("s_member_id").toString());
		tysMember.setV_member_nm(jsonObject.get("v_member_nm").toString());
		tysMember.setV_birth(jsonObject.get("v_birth").toString());
		tysMember.setPosition_nm(jsonObject.get("position_nm").toString());
		tysMember.setPosition_cd(jsonObject.get("position_cd").toString());
		tysMember.setV_desc(jsonObject.get("v_desc").toString());
		tysService.insertMember(tysMember);
		tysService.deleteMember();
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringMyBatisApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMyBatisApplication.class, args);
	}
}
