package com.smi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smi.bo.EmployeeBO;
import com.smi.dto.EmployeeDTO;

//@Component("ser")
public final class EmployeeServiceimp implements employeeService {
	private List<EmployeeBO> li;
	@Autowired
	public EmployeeServiceimp(List<EmployeeBO> li) {
		super();
		this.li = li;
	}

	@Override
	public List<EmployeeDTO> getDetails() throws Exception {
		List<EmployeeDTO> lidto = new ArrayList();

		for (EmployeeBO l : li) {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(l, dto);

			lidto.add(dto);

		}

		return lidto;
	}

}
