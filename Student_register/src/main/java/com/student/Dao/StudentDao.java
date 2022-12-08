package com.student.Dao;

import java.util.List;

import com.student.entities.StudentInfo;

public interface StudentDao {

	StudentInfo addStudent(StudentInfo std);
	List<StudentInfo> getstudnets();
	
}
