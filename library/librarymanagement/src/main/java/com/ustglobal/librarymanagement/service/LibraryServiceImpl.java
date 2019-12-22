package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.LibraryDAO;
import com.ustglobal.librarymanagement.dto.BooksDetails;
import com.ustglobal.librarymanagement.dto.User;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private LibraryDAO dao;

	@Override
	public User login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public User registerUser(User user) {
		return dao.registerUser(user);
	}

	@Override
	public BooksDetails addBooks(BooksDetails booksDetails) {
		return dao.addBooks(booksDetails);
	}
	
	@Override
	public List<BooksDetails> showAllBooks() {
		return dao.showAllBooks();
	}

	@Override
	public boolean deleteBook(int bid) {
		return dao.deleteBook(bid);
	}

	@Override
	public boolean deleteStudent(int id) {
		return dao.deleteStudent(id);
	}

	@Override
	public BooksDetails searchBook(String bookName) {
		return dao.searchBook(bookName);
	}

	@Override
	public User getStudentInfo(int id) {
		return dao.getStudentInfo(id);
	}

	@Override
	public boolean updateBook(BooksDetails bean) {
	    return dao.updateBook(bean);
	}

	@Override
	public boolean requestBook(int id, int bid) {
	  return dao.requestBook(id, bid);
	}

}