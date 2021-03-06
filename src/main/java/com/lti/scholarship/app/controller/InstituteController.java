package com.lti.scholarship.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;

@RestController
public class InstituteController {
	
	@Autowired
	private InstituteService instituteService;
	
	@RequestMapping(path="/i")
	@CrossOrigin
	public String test() {
		return "Data added";
		
	}

	
	@RequestMapping(path="/institute/add", method=RequestMethod.POST)
	@CrossOrigin
	public Institute add(@RequestBody Institute institute) {
		System.out.println(institute);
		instituteService.add(institute);
		return institute;
	}
	
	@RequestMapping(path="/institute/fetchById", method=RequestMethod.POST)
	@CrossOrigin
	public Institute fetchById(@RequestBody int id) {
		return  instituteService.fetchById(id);	
	}
	
	
	
}
