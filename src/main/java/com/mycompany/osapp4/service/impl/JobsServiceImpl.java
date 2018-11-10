package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
	public Jobs findOne(String id)
	{
		return repository.findOne(id);
	}

	@Transactional
	public List<Jobs> findAll() 
	{
		return repository.findAll();
	}
	
	@Transactional
	public Page<Jobs> findAll(int page, int size) 
	{
		return repository.findAll(new PageRequest(page, size));
	}
	
	@Transactional
	public Jobs save(JobsDTO jobsDTO) 
	{
		Jobs jobs = new Jobs(jobsDTO.getJobId(), jobsDTO.getJobTitle());	
		return repository.save(jobs);
	}
	
	@Transactional
	public Jobs update(JobsDTO jobsDTO) 
	{
		Jobs jobs = repository.getOne(jobsDTO.getJobId());
		jobs.setJobTitle(jobsDTO.getJobTitle());
		jobs.setMinSalary(jobsDTO.getMinSalary());
		jobs.setMaxSalary(jobsDTO.getMaxSalary());		
		return repository.save(jobs);	
	}
	
	@Transactional
	public String delete(String id) 
	{
		Jobs jobs = repository.getOne(id);
		try
		{
			repository.delete(jobs);
			return "OK";
		}
		catch (Exception e)
		{
			return "KO";
		}		
	}
}
