package com.example.integration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
public class Controller extends ActionSupport implements ServletRequestAware,ApplicationAware{	
	private static final long serialVersionUID = 1L;
	
	MyOperationsDAO ma = new MyOperationsDAO();
    Mybean b;
    
    public Mybean getB() {
		return b;
	}
	public void setB(Mybean b) {
		this.b = b;
	}
	
    //For RequestAware Interface
	HttpServletRequest request;
	// for ApplicationAware Interface
	Map m;
	
	public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
    public HttpServletRequest getServletRequest() {
        return request;
    }	
    
	public void setApplication(Map m) {
		this.m = m;
	}

	
	public String execute() {
		
		System.out.println(b);

		return SUCCESS;
	}

	
}
