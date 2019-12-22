package com.ustglobal.librarymanagement.dto;

import java.util.List;



public class LibraryResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<User> user;
	private List<BooksDetails> booksDetails;


	public List<BooksDetails> getBooksDetails() {
		return booksDetails;
	}
	public void setBooksDetails(List<BooksDetails> booksDetails) {
		this.booksDetails = booksDetails;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> User) {
		this.user = User;
	}


	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
