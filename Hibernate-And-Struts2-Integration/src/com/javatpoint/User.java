package com.javatpoint;

/***
 * 

		CREATE TABLE  "user451"   
		(    "ID" NUMBER(10,0) NOT NULL ENABLE,   
		 "NAME" VARCHAR2(255 CHAR),   
		  PRIMARY KEY ("ID") ENABLE  
		)  
		/  
*/

public class User {
	private int id;
	private String name;
	
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
	
	public String execute(){  
	    RegisterDao.saveUser(this);  
	    return "success";  
	}
}
