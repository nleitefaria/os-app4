package com.mycompany.osapp4.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.osapp4.dto.JobsDTO;
import com.mycompany.osapp4.entity.Jobs;

public interface JobsService 
{
	Long count();
	Jobs findOne(String id);
	List<Jobs> findAll();
	Page<Jobs> findAll(int page, int size);
	Jobs save(JobsDTO jobsDTO);
}
