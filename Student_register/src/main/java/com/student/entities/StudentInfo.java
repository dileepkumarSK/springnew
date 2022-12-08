package com.student.entities;

import javax.annotation.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentInfo")
public class StudentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private char grade;
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public char getGrade() {
		return grade;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentInfo(int studentId, String studentName, char grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	
	
}
