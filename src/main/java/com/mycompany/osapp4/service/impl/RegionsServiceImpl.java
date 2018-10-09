package com.mycompany.osapp4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.osapp4.repository.RegionsRepository;

@Service
public class RegionsServiceImpl {
	
	@Autowired
	private RegionsRepository regionsRepository;
	
	public Long count()
	{
		return regionsRepository.count();
	}



}
