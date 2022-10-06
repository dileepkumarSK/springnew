package com.layer.controller;

import com.layer.dto.StudentDTO;
import com.layer.service.StudentServiceInterface;
import com.layer.vo.StudentVO;

public class StudentController {

	private StudentServiceInterface service;

	public StudentController(StudentServiceInterface service) {

		this.service = service;
	}

	public String proccessData(StudentVO vo) throws Exception {
		StudentDTO dto = new StudentDTO();

		dto.setId(vo.getId());
		dto.setName(vo.getName());
		dto.setM1(vo.getM1());
		dto.setM2(vo.getM2());
		dto.setM3(vo.getM3());
		String res=service.average(dto);
		
		return res;
	}

}
