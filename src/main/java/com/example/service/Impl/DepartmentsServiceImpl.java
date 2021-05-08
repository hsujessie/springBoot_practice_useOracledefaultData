package com.example.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.DepartmentsRepository;
import com.example.service.DepartmentsService;

@Service
public class DepartmentsServiceImpl implements DepartmentsService{
	@Autowired
	DepartmentsRepository departmentsRepository;
	
	public Object query(){
		return departmentsRepository.findAll();
	}
}
