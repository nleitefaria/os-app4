package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.entity.Regions;
import com.mycompany.osapp4.repository.RegionsRepository;

@Service
public class RegionsServiceImpl {
	
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



}
