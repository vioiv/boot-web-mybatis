package com.example.demo;

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
		TysMember tysMember = tysService.selectMember();
		System.out.println(tysMember.getvMemberNm());
		return "Greetings!";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMyBatisApplication.class, args);
	}
}
