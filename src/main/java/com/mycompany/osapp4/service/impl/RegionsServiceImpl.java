package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.entity.Regions;
import com.mycompany.osapp4.repository.RegionsRepository;
import com.mycompany.osapp4.service.RegionsService;

@Service
public class RegionsServiceImpl implements RegionsService
{
	@Autowired
	private RegionsRepository repository;
	
	@Transactional
	public Long count()
	{
		return repository.count();
	}
	
	@Transactional
	public List<Regions> findAll()
	{
		return repository.findAll();
	}
	
	@Transactional
	public Regions findOne(String id)
	{
		return repository.findOne(Integer.parseInt(id));
	}



}
