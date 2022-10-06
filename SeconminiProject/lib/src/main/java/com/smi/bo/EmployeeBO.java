package com.smi.bo;

import org.springframework.stereotype.Component;

@Component("bo")
public class EmployeeBO {

	private String name,job;
	private Integer id,deptno;
	private Float sal;
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public Integer getId() {
		return id;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public Float getSal() {
		return sal;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public void setSal(Float sal) {
		this.sal = sal;
	}
	
	
}
