package com.infy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.CourseDTO;
import com.infy.entity.Course;
import com.infy.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

	
	@Autowired
	CourseRepository repo;
	
	@Override
	public CourseDTO getCourse(String courseName) {
		// TODO Auto-generated method stub
		Course c = repo.findByCourseName(courseName);
		CourseDTO c1 = new CourseDTO();
		c1.setCourseId(c.getCourseId());
		c1.setCourseName(c.getCourseName());
		c1.setCourseDescription(c.getCourseDescription());
		
		return c1;
	}

	@Override
	public List<CourseDTO> viewAll() {
		// TODO Auto-generated method stub
		Iterable<Course> iter = repo.findAll();
		List<CourseDTO> list = new ArrayList();
		
		for(Course c : iter) {
			CourseDTO cd = new CourseDTO();
			cd.setCourseId(c.getCourseId());
			cd.setCourseName(c.getCourseName());
			cd.setCourseDescription(c.getCourseDescription());
			
			list.add(cd);
		}
		
		return list;
	}
	
	
	
	
	
	

}
