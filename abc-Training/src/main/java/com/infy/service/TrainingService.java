package com.infy.service;

import java.util.List;

import com.infy.dto.TrainingDTO;

public interface TrainingService {
	
	public List<TrainingDTO> getSpecificTraining(Integer empId);

}
