package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.Dao.StudentDao;
import com.student.entities.StudentInfo;

@Controller
public class MainController {
	@Autowired
	private StudentDao dao;

	
	public MainController() {
		super();
		System.out.println("MainController.MainController()");
		// TODO Auto-generated constructor stub
	}


	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	
	public StudentInfo addstudent(StudentInfo std)
	{
		
		return dao.addStudent(std);
		
	}
	@RequestMapping("/getStudents")
	public String getstudents(Model model)
	{
		List<StudentInfo> list=dao.getstudnets();
		model.addAllAttributes(list);
		return "students-list";
		
	}

}
