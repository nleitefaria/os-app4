package com.mycompany.osapp4.service;

import java.util.List;

import com.mycompany.osapp4.dto.CountriesDTO;
import com.mycompany.osapp4.entity.Countries;

public interface CountriesService 
{
	Long count();
	List<Countries> findAll();
	Countries findOne(String id);
	Countries save(CountriesDTO countryDTO);
}
