package com.example.demo;

import org.apache.ibatis.type.Alias;

@Alias("tysmember")
public class TysMember {
	private String vMemberNm;
	private String vPosition;
	
	public TysMember() {}
	
	public TysMember(String vMemberNm, String vPosition) {
		this.setvMemberNm(vMemberNm);
		this.setvPosition(vPosition);
	}

	public String getvMemberNm() {
		return vMemberNm;
	}

	public void setvMemberNm(String vMemberNm) {
		this.vMemberNm = vMemberNm;
	}

	public String getvPosition() {
		return vPosition;
	}

	public void setvPosition(String vPosition) {
		this.vPosition = vPosition;
	}
}
