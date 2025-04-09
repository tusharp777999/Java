package com.tushar.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Welcome-Service")
public interface WelcomeFeignClient {

	@GetMapping("/welcome")
	public String getWelcomeMsg();
	
}
