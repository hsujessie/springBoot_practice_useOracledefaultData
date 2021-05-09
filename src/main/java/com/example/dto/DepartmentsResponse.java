package com.example.dto;

import java.util.List;

public class DepartmentsResponse {
	private String code;
	
	private String msg;
	
	private List<DepartmentsResponseData> data;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<DepartmentsResponseData> getData() {
		return data;
	}

	public void setData(List<DepartmentsResponseData> data) {
		this.data = data;
	}
	
	
}
