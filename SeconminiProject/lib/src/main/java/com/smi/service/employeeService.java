package com.smi.service;

import java.util.List;

import com.smi.dto.EmployeeDTO;

public interface employeeService {
    
	List<EmployeeDTO> getDetails() throws Exception;
	
}
