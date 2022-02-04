package com.microservice.example.limitservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.example.limitservice.entity.Limits;

@RestController
public class LimitServiceController {
	
	@GetMapping("/limits")
	public Limits getLimit()
	{
		return new Limits(1,1000);
	}

}
