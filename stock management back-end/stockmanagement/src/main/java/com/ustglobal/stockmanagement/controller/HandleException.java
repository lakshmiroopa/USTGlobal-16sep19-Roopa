package com.ustglobal.stockmanagement.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.stockmanagement.dto.ProductResponse;

@RestControllerAdvice /* (@ControllerAdvice+@ResponseBody) */
public class HandleException {
    @ExceptionHandler(Exception.class)
	public  ProductResponse getException() {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setMessage("Internal error");
		response.setDescription("got an Exception");
		return response;
	}

}
