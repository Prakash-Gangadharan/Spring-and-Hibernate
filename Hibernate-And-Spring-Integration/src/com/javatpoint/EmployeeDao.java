package com.javatpoint;

import org.springframework.orm.hibernate3.HibernateTemplate;


public class EmployeeDao {
	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	//method to save employee  
	public void saveEmployee(Employee e){  
	    template.save(e);  
	    System.out.println("saved successfully");
	}  

}
