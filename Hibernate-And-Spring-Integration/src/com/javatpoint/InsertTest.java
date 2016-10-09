package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {
	
	public static void main(String args[]){
		System.out.println("hello");
		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println(factory);
		
		EmployeeDao dao = (EmployeeDao) factory.getBean("d");
		
		Employee e = new Employee();
		
		e.setId(116);
		e.setName("lokesh");
		e.setSalary(40000);
		
		dao.saveEmployee(e);
	}

}