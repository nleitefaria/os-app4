package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.dto.JobsDTO;
import com.mycompany.osapp4.dto.LocationsDTO;
import com.mycompany.osapp4.entity.Countries;
import com.mycompany.osapp4.entity.Jobs;
import com.mycompany.osapp4.entity.Locations;
import com.mycompany.osapp4.repository.CountriesRepository;
import com.mycompany.osapp4.repository.LocationsRepository;
import com.mycompany.osapp4.service.LocationsService;

@Service
public class LocationsServiceImpl implements LocationsService
{
	@Autowired
	private LocationsRepository repository1;
	
	@Autowired
	private CountriesRepository repository2;
	
	@Transactional
	public Long count()
	{
		return repository1.count();
	}
	
	@Transactional
	public List<Locations> findAll()
	{
		return repository1.findAll();
	}
	
	@Transactional
	public Locations findOne(String id)
	{
		return repository1.findOne(Integer.parseInt(id));
	}
	
	@Transactional
	public Locations save(LocationsDTO locationsDTO)  
	{		
		Countries country = repository2.findOne(locationsDTO.getCountryId());		
		Locations location = new Locations(country, locationsDTO.getCity());		
		return repository1.save(location);
	}


}
