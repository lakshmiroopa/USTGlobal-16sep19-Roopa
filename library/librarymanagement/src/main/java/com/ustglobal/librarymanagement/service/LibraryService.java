package com.ustglobal.librarymanagement.service;

import java.util.List;

import com.ustglobal.librarymanagement.dto.BooksDetails;
import com.ustglobal.librarymanagement.dto.User;

public interface LibraryService {
	
	public User login(String email, String password);
	public User registerUser(User user);
	public BooksDetails addBooks(BooksDetails booksDetails);
	public List<BooksDetails> showAllBooks();
	public boolean requestBook(int id, int bid);
	public boolean deleteBook(int bid);
	BooksDetails searchBook(String bookName);
	public boolean deleteStudent(int id);
	public User getStudentInfo(int id);
	public boolean updateBook(BooksDetails bean);

}
