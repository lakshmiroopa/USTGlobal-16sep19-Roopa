package com.ustglobal.librarymanagement.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.librarymanagement.dto.LibraryResponse;

@RestControllerAdvice /* (@ControllerAdvice+@ResponseBody) */
public class HandleException {
    @ExceptionHandler(Exception.class)
	public  LibraryResponse getException() {
		LibraryResponse response = new LibraryResponse();
		response.setStatusCode(501);
		response.setMessage("Internal error");
		response.setDescription("got an Exception");
		return response;
	}

}
