package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/departments/search/{departmentName}")
	public Object search(@PathVariable String departmentName) {
		return departmentsService.search(departmentName);
	}
}
