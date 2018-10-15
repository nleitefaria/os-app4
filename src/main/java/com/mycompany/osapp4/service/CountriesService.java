package com.mycompany.osapp4.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.osapp4.dto.CountriesDTO;
import com.mycompany.osapp4.entity.Countries;

public interface CountriesService 
{
	Long count();
	List<Countries> findAll();
	Page<Countries> findAll(int page, int size);
	Countries findOne(String id);
	Countries save(CountriesDTO countryDTO);
	Countries update(CountriesDTO countryDTO);
	String delete(String id);
}
