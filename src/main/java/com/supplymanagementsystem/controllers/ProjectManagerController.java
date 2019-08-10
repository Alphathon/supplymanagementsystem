package com.supplymanagementsystem.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectManagerController {
	
	@GetMapping(path = "/demands")
	public ResponseEntity<?> getDemands() {
		 return null;
	}

}
