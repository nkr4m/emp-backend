package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.CourseDTO;
import com.infy.service.CourseService;

@RestController
@RequestMapping("course-api")
@CrossOrigin
public class CourseAPI {
	
	@Autowired
	CourseService service;
	
	@GetMapping("/{courseName}")
	public ResponseEntity<CourseDTO> getCourse(@PathVariable String courseName){
		CourseDTO c = service.getCourse(courseName);
		return new ResponseEntity<CourseDTO>(c, HttpStatus.OK);
	}
	
	
	@GetMapping("/GET")
	public ResponseEntity<List<CourseDTO>> getAll(){
		List<CourseDTO> list = service.viewAll();
		return new ResponseEntity<List<CourseDTO>>(list, HttpStatus.OK);
	}

}
