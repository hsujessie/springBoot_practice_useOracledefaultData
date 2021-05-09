package com.example.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.DepartmentsResponse;
import com.example.dto.DepartmentsResponseData;
import com.example.entity.Departments;
import com.example.entity.Locations;
import com.example.repository.DepartmentsRepository;
import com.example.repository.LocationsRepository;
import com.example.service.DepartmentsService;

@Service
public class DepartmentsServiceImpl implements DepartmentsService{
	@Autowired
	DepartmentsRepository departmentsRepository;
	
	@Autowired 
	LocationsRepository locationsRepository;
	
	public Object query(){
		return departmentsRepository.findAll();
	}

	@Override
	public DepartmentsResponse search(String departmentName) {
		DepartmentsResponse response = new DepartmentsResponse();
		response.setCode("000");
		response.setMsg("success");
		
		List<Departments> dapartmentsList = departmentsRepository.findByDepartmentNameLike("%" + departmentName + "%");
		List<DepartmentsResponseData> dataList = new ArrayList<>();
		
		for(Departments department:dapartmentsList) {
			DepartmentsResponseData data =  new DepartmentsResponseData();
			data.setDepartmentName(department.getDepartmentName());
			
			Optional<Locations> locations = locationsRepository.findById(department.getLocationId());
			if(locations.isPresent()) {
				data.setLocation(locations.get().getCity());
			}
			dataList.add(data);
		}
		
		if(dataList.isEmpty()) {
			response.setCode("999");
			response.setMsg("no data");
		}
		response.setData(dataList);
		return response;
	}
}
