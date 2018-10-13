package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.dto.JobsDTO;
import com.mycompany.osapp4.entity.Jobs;
import com.mycompany.osapp4.repository.JobsRepository;
import com.mycompany.osapp4.service.JobsService;

@Service
public class JobsServiceImpl implements JobsService
{
	@Autowired
	private JobsRepository repository;

	@Transactional
	public Long count() 
	{
		return repository.count();
	}

	@Transactional
	public List<Jobs> findAll() 
	{
		return repository.findAll();
	}
	
	@Transactional
	public Jobs findOne(String id)
	{
		return repository.findOne(id);
	}
	
	@Transactional
	public Jobs save(JobsDTO jobsDTO) 
	{
		Jobs jobs = new Jobs(jobsDTO.getJobId(), jobsDTO.getJobTitle());	
		return repository.save(jobs);
	}

	

}
