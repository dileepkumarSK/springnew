package com.student.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.student.entities.StudentInfo;

import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory factory;

	@Transactional
	public StudentInfo addStudent(StudentInfo std) {
		Session session = factory.getCurrentSession();
		StudentInfo std1=(StudentInfo) session.save(std);
		return null;
	}
	
	
	
	@Transactional
	public List<StudentInfo> getstudnets()
	{
		Session session=factory.getCurrentSession();
		
	 List<StudentInfo> list=session.createQuery("from studentInfo").getResultList();
		
		return list;
		
	}

}
