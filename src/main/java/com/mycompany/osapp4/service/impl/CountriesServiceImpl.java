package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.dto.CountriesDTO;
import com.mycompany.osapp4.entity.Countries;
import com.mycompany.osapp4.entity.Regions;
import com.mycompany.osapp4.repository.CountriesRepository;
import com.mycompany.osapp4.repository.RegionsRepository;
import com.mycompany.osapp4.service.CountriesService;

@Service
public class CountriesServiceImpl implements CountriesService 
{
	@Autowired
	private CountriesRepository repository1;
	
	@Autowired
	private RegionsRepository repository2;

	@Transactional
	public Long count() 
	{
		return repository1.count();
	}

	@Transactional
	public List<Countries> findAll() 
	{
		return repository1.findAll();
	}
	
	@Transactional
	public Countries findOne(String id) 
	{
		return repository1.findOne(id);
	}
	
	@Transactional
	public Countries save(CountriesDTO countryDTO) 
	{
		Integer regionId = countryDTO.getRegionID(); 
		Regions region = repository2.findOne(regionId);
		Countries country = new Countries(countryDTO.getCountryId(), region);
		country.setCountryName(countryDTO.getCountryName());
		return repository1.save(country);
	}

}
