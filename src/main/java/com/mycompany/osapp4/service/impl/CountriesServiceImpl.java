package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.entity.Countries;
import com.mycompany.osapp4.repository.CountriesRepository;
import com.mycompany.osapp4.repository.LocationsRepository;
import com.mycompany.osapp4.service.CountriesService;

@Service
public class CountriesServiceImpl implements CountriesService 
{
	@Autowired
	private CountriesRepository repository;

	@Transactional
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Countries> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
