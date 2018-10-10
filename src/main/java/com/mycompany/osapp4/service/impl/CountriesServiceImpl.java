package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.entity.Countries;
import com.mycompany.osapp4.repository.CountriesRepository;
import com.mycompany.osapp4.service.CountriesService;

@Service
public class CountriesServiceImpl implements CountriesService 
{
	@Autowired
	private CountriesRepository repository;

	@Transactional
	public Long count() 
	{
		return repository.count();
	}

	@Transactional
	public List<Countries> findAll() 
	{
		return repository.findAll();
	}
	
	@Transactional
	public Countries findOne(String id) 
	{
		return repository.findOne(id);
	}

}
