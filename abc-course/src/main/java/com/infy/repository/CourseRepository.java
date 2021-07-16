package com.infy.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.dto.CourseDTO;
import com.infy.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Integer>{
	
	public Course findByCourseName(String courseName);

}
