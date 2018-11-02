package com.example.demo;

import org.apache.ibatis.type.Alias;

@Alias("tysmember")
public class TysMember {
	private String vMemberNm;
	private String vPosition;
	private String s_member_nm;
	private String v_birth;
	private String v_desc;
	private String v_no;
	private String v_team;
	
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

	public String getS_member_nm() {
		return s_member_nm;
	}

	public void setS_member_nm(String s_member_nm) {
		this.s_member_nm = s_member_nm;
	}

	public String getV_birth() {
		return v_birth;
	}

	public void setV_birth(String v_birth) {
		this.v_birth = v_birth;
	}

	public String getV_desc() {
		return v_desc;
	}

	public void setV_desc(String v_desc) {
		this.v_desc = v_desc;
	}

	public String getV_no() {
		return v_no;
	}

	public void setV_no(String v_no) {
		this.v_no = v_no;
	}

	public String getV_team() {
		return v_team;
	}

	public void setV_team(String v_team) {
		this.v_team = v_team;
	}
}
