package com.mycompany.osapp4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.osapp4.dto.RegionsDTO;
import com.mycompany.osapp4.entity.Regions;
import com.mycompany.osapp4.repository.RegionsRepository;
import com.mycompany.osapp4.service.RegionsService;

@Service
public class RegionsServiceImpl implements RegionsService
{
	@Autowired
	private RegionsRepository repository;
	
	public Long count()
	{
		return repository.count();
	}
		
	public Regions findOne(String id)
	{
		return repository.findOne(Integer.parseInt(id));
	}
		
	public List<Regions> findAll()
	{
		return repository.findAll();
	}
	
	
	public Page<Regions> findAll(int page, int size) 
	{
		return repository.findAll(new PageRequest(page, size));
	}

	@Transactional
	public Regions save(RegionsDTO regionsDTO)  
	{		
		Regions region = new Regions(regionsDTO.getRegionId());
		region.setRegionName(regionsDTO.getRegionName());
		return repository.save(region);
	}
	
	@Transactional
	public Regions update(RegionsDTO regionsDTO) 
	{
		Regions regions = repository.getOne(regionsDTO.getRegionId());
		regions.setRegionName(regionsDTO.getRegionName());
		return repository.save(regions);
	}
}
