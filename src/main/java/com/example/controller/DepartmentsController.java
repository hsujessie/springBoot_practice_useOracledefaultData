package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.DepartmentsService;

@RestController
public class DepartmentsController {
	
	@Autowired
	DepartmentsService departmentsService;
	
	@GetMapping("/departments/query")
	public Object query() {
		return departmentsService.query();
	}
}
