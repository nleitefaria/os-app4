package com.mycompany.osapp4.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mycompany.osapp4.dto.RegionsDTO;
import com.mycompany.osapp4.entity.Regions;

public interface RegionsService 
{
	Long count();
	Regions findOne(String id);
	List<Regions> findAll();
	Page<Regions> findAll(int page, int size);
	Regions save(RegionsDTO regionsDTO);
	Regions update(RegionsDTO regionsDTO);
}
