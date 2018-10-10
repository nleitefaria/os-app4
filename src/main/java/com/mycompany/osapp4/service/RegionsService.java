package com.mycompany.osapp4.service;

import java.util.List;

import com.mycompany.osapp4.entity.Regions;

public interface RegionsService 
{
	Long count();
	List<Regions> findAll();

}
