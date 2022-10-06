package com.layer.service;

import com.layer.Dao.StudentDAO;
import com.layer.bo.StudentBo;
import com.layer.dto.StudentDTO;

public class StudentServiceImpl implements StudentServiceInterface
{     
	private StudentDAO dao;
	private StudentBo bo;

	public StudentServiceImpl(StudentDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String average(StudentDTO dto) throws Exception {
		int success=0;
			int avg=((dto.getM1()+dto.getM2()+dto.getM3())*100 )/300;
			
		
				bo=new  StudentBo();
				bo.setId(dto.getId());
				bo.setName(dto.getName());
				bo.setM1(dto.getM1());
				bo.setM2(dto.getM2());
				bo.setM3(dto.getM3());
				success=dao.insert(bo);
			if(success!=0)	
				return "passcStored In DataBase"+avg+"";
			
			else
				return "Failed Not stored in database";
	}

}
