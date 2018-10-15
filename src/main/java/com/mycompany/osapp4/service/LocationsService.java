package com.mycompany.osapp4.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.osapp4.dto.LocationsDTO;
import com.mycompany.osapp4.entity.Locations;

public interface LocationsService 
{
	Long count();
	Locations findOne(String id);
	List<Locations> findAll();
	Page<Locations> findAll(int page, int size);
	Locations update(LocationsDTO locationsDTO);
	Locations save(LocationsDTO locationsDTO);
}
