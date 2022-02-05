package com.microservice.example.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.example.limitservice.configuration.Configuration;
import com.microservice.example.limitservice.entity.Limits;

@RestController
public class LimitServiceController {
	
	@Autowired
	private Configuration config;
	
	
	@GetMapping("/limits")
	public Limits getLimit()
	{
		return new Limits(config.getMinimum(), config.getMaximum());
	//	return new Limits(5,1000);
	}

}
