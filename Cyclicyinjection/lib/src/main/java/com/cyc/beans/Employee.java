package com.cyc.beans;

public class Employee {
private Owner o;

public void setEmp(Owner o) {
	System.out.println("employee constructor");
	this.o = o;
}

public Employee(Owner o) {
	super();
	this.o = o;
	System.out.println("Employee.Employee()");
}


}
