package com.ustglobal.librarymanagement.dao;

import java.util.List;

import com.ustglobal.librarymanagement.dto.BooksDetails;
import com.ustglobal.librarymanagement.dto.BooksRegistration;
import com.ustglobal.librarymanagement.dto.User;

public interface LibraryDAO {

	public User login(String email, String password);

	public User registerUser(User user);

	public boolean requestBook(int id, int bid);

	public List<BooksDetails> showAllBooks();

	public User getStudentInfo(int id);

	public boolean deleteStudent(int id);

	public BooksDetails addBooks(BooksDetails booksDetails);

	public boolean deleteBook(int bid);

	public List<BooksRegistration> viewRequest();

	BooksDetails searchBook(String bookName);
	
	public boolean updateBook(BooksDetails bean);

	

}
