package com.infy.service;

import com.infy.dto.EmployeeDTO;
import com.infy.dto.LoginDTO;

public interface EmployeeService {
	
	public EmployeeDTO getSpecificEmployee(Integer empId);
	
//	public boolean login(LoginDTO login);
	
	public void updateEmployee(Integer empId, EmployeeDTO empDto);
	
	

}
