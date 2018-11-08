package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TysService {
	@Autowired
	TysMapper tysMapper;
	
	public List<TysMember> selectMember() {
		return tysMapper.selectMember();
	}

	public void insertMember(TysMember tysMember) {
		tysMapper.insertMember(tysMember);
	} 
	
	public void deleteMember() {
		tysMapper.deleteMember();
	}
}
