package com.smi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smi.dto.EmployeeDTO;
import com.smi.vo.EmployeeVO;


@Component("cont")
public class EmployeeController {
	private List<EmployeeDTO> l;

	@Autowired
	public EmployeeController(List<EmployeeDTO> l) {
		System.out.println("EmployeeController.EmployeeController()");
		this.l = l;
	}

	public List<EmployeeVO> Showdetails() {
		List<EmployeeVO> li = new ArrayList<>();
		
		for(EmployeeDTO c:l)
		{
			BeanUtils.copyProperties(c, li);
		}
		return li;

	}

}
