package com.infy.service;

import java.util.List;

import com.infy.dto.CourseDTO;

public interface CourseService {
	
	public CourseDTO getCourse(String courseName);
	
	public List<CourseDTO> viewAll();

}
