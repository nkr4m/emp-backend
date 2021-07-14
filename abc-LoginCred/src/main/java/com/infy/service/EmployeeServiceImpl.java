package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.EmployeeCredDTO;
import com.infy.entity.EmployeeCred;
import com.infy.repository.EmployeeCredRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeCredRepository repo;
	
	@Override
	public EmployeeCredDTO getCred(Integer empId) {
		// TODO Auto-generated method stub
		
		EmployeeCred e = repo.findByEmpId(empId);
		
		EmployeeCredDTO emp = new EmployeeCredDTO();
		emp.setCredId(e.getCredId());
		emp.setEmpId(e.getEmpId());
		emp.setPassword(e.getPassword());
		
		return emp;
	}

	
}
