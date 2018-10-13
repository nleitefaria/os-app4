package com.mycompany.osapp4.service;

import java.util.List;

import com.mycompany.osapp4.dto.JobsDTO;
import com.mycompany.osapp4.entity.Jobs;

public interface JobsService 
{
	Long count();
	List<Jobs> findAll();
	Jobs findOne(String id);
	Jobs save(JobsDTO jobsDTO);
}
