package com.javatpoint;

/***
 * 

		CREATE TABLE  "EMP558"   
		(    "ID" NUMBER(10,0) NOT NULL ENABLE,   
		 "NAME" VARCHAR2(255 CHAR),   
		 "SALARY" FLOAT(126),   
		  PRIMARY KEY ("ID") ENABLE  
		)  
		/  
*/
public class Employee {
	private int id;
	private String name;
	private float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
