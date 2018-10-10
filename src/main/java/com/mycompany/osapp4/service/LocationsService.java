package com.mycompany.osapp4.service;

import java.util.List;

import com.mycompany.osapp4.entity.Locations;

public interface LocationsService 
{
	Long count();
	List<Locations> findAll();

}
