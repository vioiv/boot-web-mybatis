package com.example.demo;

import org.apache.ibatis.type.Alias;

@Alias("tysmember")
public class TysMember {
	private String v_no;
	private String s_member_id;
	private String v_member_nm;
	private String v_birth;
	private String position_nm;
	private String position_cd;
	private String v_desc;
	
	public TysMember() {}
	
	public TysMember(String v_no, String s_member_id, String v_member_nm, String v_birth, String position_nm, String position_cd, String v_desc) {
		this.v_no = v_no;
		this.s_member_id = s_member_id;
		this.v_member_nm = v_member_nm;
		this.v_birth = v_birth;
		this.position_nm = position_nm;
		this.position_cd = position_cd;
		this.v_desc = v_desc;
	}
	
	public String getV_no() {
		return v_no;
	}
	public void setV_no(String v_no) {
		this.v_no = v_no;
	}
	public String getS_member_id() {
		return s_member_id;
	}
	public void setS_member_id(String s_member_id) {
		this.s_member_id = s_member_id;
	}
	public String getV_member_nm() {
		return v_member_nm;
	}
	public void setV_member_nm(String v_member_nm) {
		this.v_member_nm = v_member_nm;
	}
	public String getV_birth() {
		return v_birth;
	}
	public void setV_birth(String v_birth) {
		this.v_birth = v_birth;
	}
	public String getPosition_nm() {
		return position_nm;
	}
	public void setPosition_nm(String position_nm) {
		this.position_nm = position_nm;
	}
	public String getPosition_cd() {
		return position_cd;
	}
	public void setPosition_cd(String position_cd) {
		this.position_cd = position_cd;
	}
	public String getV_desc() {
		return v_desc;
	}
	public void setV_desc(String v_desc) {
		this.v_desc = v_desc;
	}
}
