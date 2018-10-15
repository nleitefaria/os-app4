package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.dto.LocationsDTO;
import com.mycompany.osapp4.entity.Countries;
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
	
	public Long count()
	{
		return repository1.count();
	}
	
	public Locations findOne(String id)
	{
		return repository1.findOne(Integer.parseInt(id));
	}
	
	
	public List<Locations> findAll()
	{
		return repository1.findAll();
	}

	public Page<Locations> findAll(int page, int size) 
	{
		return repository1.findAll(new PageRequest(page, size));
	}
	
	@Transactional
	public Locations save(LocationsDTO locationsDTO)  
	{		
		Countries country = repository2.findOne(locationsDTO.getCountryId());		
		Locations location = new Locations(country, locationsDTO.getCity());
		location.setStreetAddress(locationsDTO.getStreetAddress());
		location.setCity(locationsDTO.getCity());
		location.setPostalCode(locationsDTO.getPostalCode());
		location.setStateProvince(locationsDTO.getStateProvince());
		return repository1.save(location);
	}
	
	@Transactional
	public Locations update(LocationsDTO locationsDTO) 
	{
		Countries country = repository2.findOne(locationsDTO.getCountryId());				
		Locations location = new Locations(country, locationsDTO.getCity());	
		location.setStreetAddress(locationsDTO.getStreetAddress());
		location.setCity(locationsDTO.getCity());
		location.setPostalCode(locationsDTO.getPostalCode());
		location.setStateProvince(locationsDTO.getStateProvince());
		return repository1.save(location);	
	}
}
