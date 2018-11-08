package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface TysMapper {
	public List<TysMember> selectMember();

//	@Options(useGeneratedKeys = true)
//	@Insert("insert into tyx_member values (seq_member.nextval, #{v_member_nm}, #{v_birth}, #{position_cd}, #{v_desc}, #{s_member_id}, '한국')")
	public Integer insertMember(TysMember tysMember);
	
}
