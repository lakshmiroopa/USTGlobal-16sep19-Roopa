package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponse;

@RestControllerAdvice /* (@ControllerAdvice+@ResponseBody) */
public class HandleException {
    @ExceptionHandler(Exception.class)
	public  EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Internal error");
		response.setDescription("got an Exception");
		return response;
	}

}
