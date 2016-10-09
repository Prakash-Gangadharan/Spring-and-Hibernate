package com.example.integration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
public class Java4sController extends ActionSupport implements ServletRequestAware,ApplicationAware{	
	private static final long serialVersionUID = 1L;
	
	MyOperationsDAO myOperations = new MyOperationsDAO();	
	private List<Mybean> recordsFromDB;
    Mybean myBean;
    
    //For RequestAware Interface
	HttpServletRequest request;	
	// for ApplicationAware Interface
	Map m;
    
	public Mybean getB() {
		return myBean;
	}
	public void setB(Mybean b) {
		this.myBean = b;
	}
	
	
	public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
    public HttpServletRequest getServletRequest() {
        return request;
    }
    
	public void setApplication(Map m) {
		this.m = m;
	}
    
    //For Bean, while selecting..
	public List<Mybean> getRecordsFromDB() {
		return this.recordsFromDB;
	}
	
	/**
	 * 
	 * For select query
	 * 
	 * @return
	 */
	public String getRecords() {
		recordsFromDB = myOperations.retrieveRecords();
		request.setAttribute("rec", recordsFromDB);
		return SUCCESS;
	} 
	
	/**
	 * For update query
	 * 
	 * @return
	 */
	public String getRecordToUpdate() {
		recordsFromDB = myOperations.retrieveRecord(request.getParameter("fid"));
		
		Iterator<Mybean> it = recordsFromDB.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			myBean = (Mybean) o;
		}
		
		m.put("x", myBean.getNo());
		m.put("y", myBean.getNam());
		m.put("z", myBean.getCt());
		
		return SUCCESS;
	}
	
	/**
	 * Insert method
	 * 
	 * @return
	 */
	public String insertRecord() {
		myOperations.insertRecord(myBean);
		return SUCCESS;
	}
	
	/**
	 * update in database
	 * 
	 * @return
	 */
	public String updateRec() {
		myOperations.upRecord(myBean);
		return SUCCESS;
	}
	
	/**
	 * Delete from database
	 * 
	 * @return
	 */
	public String deleteRecord() {
		String cv[] = null;
		cv = request.getParameterValues("rdel");
		myOperations.deleteRecord(cv);
		return SUCCESS;
	}
	
}
