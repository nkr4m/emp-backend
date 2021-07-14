package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.EmployeeCredDTO;
import com.infy.service.EmployeeService;

@RestController
public class EmployeeCredApi {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/GET/{empId}")
	public ResponseEntity<EmployeeCredDTO> getCred(@PathVariable Integer empId){
		EmployeeCredDTO e = service.getCred(empId);
		return new ResponseEntity<EmployeeCredDTO>(e, HttpStatus.OK);
	}
	

}
