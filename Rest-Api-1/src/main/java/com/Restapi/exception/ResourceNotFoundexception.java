//package com.Restapi.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ResponseStatus(value = HttpStatus.NOT_FOUND)
//public class ResourceNotFoundexception extends RuntimeException {
//	
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private String resourcname;
//	private String fieldname;
//	private Object fieldvalue;
//	 
//	public ResourceNotFoundexception(String resourcname, String fieldname, Object fieldvalue) {
//		super(String.format( "%s not found with %s : '%s' ",  resourcname, fieldname, fieldvalue));
//		this.resourcname = resourcname;
//		this.fieldname = fieldname;
//		this.fieldvalue = fieldvalue;
//	}
//
//	public String getResourcname() {
//		return resourcname;
//	}
//
//	public String getFieldname() {
//		return fieldname;
//	}
//
//	public Object getFieldvalue() {
//		return fieldvalue;
//	}
//	
//}
