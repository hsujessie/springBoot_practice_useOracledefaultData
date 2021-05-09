package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Departments;

public interface DepartmentsRepository extends CrudRepository<Departments, Integer>{
	public List<Departments> findByDepartmentNameLike(String departmentName);
}
