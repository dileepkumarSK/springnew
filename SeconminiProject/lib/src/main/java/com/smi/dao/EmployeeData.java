package com.smi.dao;

import java.util.List;

import com.smi.bo.EmployeeBO;

public interface EmployeeData {
   
	List<EmployeeBO> getDetails() throws Exception; 
}
