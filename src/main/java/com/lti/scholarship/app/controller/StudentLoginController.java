package com.lti.scholarship.app.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lti.scholarship.app.repository.GenericRepository;

@Service
public class StudentLoginController {
	GenericRepository genericRepository;
	
	@Transactional
	public boolean verifyUser(String userName,String password) {
		System.out.println("service verifier called");
	return genericRepository.verify(userName, password);
	}
}
