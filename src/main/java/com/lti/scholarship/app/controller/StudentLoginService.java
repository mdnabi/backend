package com.lti.scholarship.app.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class StudentLoginService {
	@Autowired
	private GenericRepository genericRepository;
	
	@Transactional
	public boolean verify(String userid, String password) {
		System.out.println("verify @ service");
		boolean result = genericRepository.verify(userid, password);
		System.out.println(result+" generic");
		return result;
	}

}
