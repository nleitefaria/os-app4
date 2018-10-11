package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.entity.Locations;
import com.mycompany.osapp4.repository.LocationsRepository;
import com.mycompany.osapp4.service.LocationsService;

@Service
public class LocationsServiceImpl implements LocationsService
{
	@Autowired
	private LocationsRepository repository;
	
	@Transactional
	public Long count()
	{
		return repository.count();
	}
	
	@Transactional
	public List<Locations> findAll()
	{
		return repository.findAll();
	}
	
	@Transactional
	public Locations findOne(String id)
	{
		return repository.findOne(Integer.parseInt(id));
	}
	

}
