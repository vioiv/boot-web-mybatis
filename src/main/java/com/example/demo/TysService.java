package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TysService {
	@Autowired
	TysMapper tysMapper;
	
	public TysMember selectMember() {
		return tysMapper.selectMember();
	} 
}
