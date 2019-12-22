package com.ustglobal.librarymanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.BooksDetails;
import com.ustglobal.librarymanagement.dto.LibraryResponse;
import com.ustglobal.librarymanagement.dto.User;
import com.ustglobal.librarymanagement.service.LibraryService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LibraryController {
	@Autowired
	private LibraryService service;

	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User login(@RequestBody User user1) {
		LibraryResponse response = new LibraryResponse();
		User user = service.login(user1.getEmail(), user1.getPassword());
		return user;
	}

	@PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse register(@RequestBody User user) {
		LibraryResponse response = new LibraryResponse();
		if (service.registerUser(user) != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Successfully Registered");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");

		}
		return response;

	}

	@PostMapping(path = "/add-books", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse addBooks(@RequestBody BooksDetails booksDetails) {
		LibraryResponse response = new LibraryResponse();
		if (service.addBooks(booksDetails) != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Books added Successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");
			response.setBooksDetails(Arrays.asList(booksDetails));
		}
		return response;

	}

	@GetMapping(path = "/show-books", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse showAllBooks() {
		LibraryResponse response = new LibraryResponse();
		List<BooksDetails> booksDetails = service.showAllBooks();
		if (!booksDetails.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data added to the DB");
			response.setBooksDetails(booksDetails);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}

	@DeleteMapping(path = "/delete-book/{bid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteBook(@PathVariable("bid") int bid) {
		LibraryResponse response = new LibraryResponse();
		if (service.deleteBook(bid)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data deleted from the DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not deleted from the DB");

		}
		return response;
	}

	@DeleteMapping(path = "/delete-user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteStudent(@PathVariable("id") int id) {
		LibraryResponse response = new LibraryResponse();
		if (service.deleteStudent(id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data deleted from the DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not deleted from the DB");

		}

		return response;
	}

	@GetMapping(path = "/search-book/{bookName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchBook(@PathVariable("bookName") String bookName) {
		LibraryResponse response = new LibraryResponse();
		BooksDetails booksDetails = service.searchBook(bookName);
		if (booksDetails != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setBooksDetails(Arrays.asList(booksDetails));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}

	@GetMapping(path = "/get-user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getStudentInfo(@PathVariable("id") int id) {
		LibraryResponse response = new LibraryResponse();
		User user = service.getStudentInfo(id);
		if (user != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in the DB");
			response.setUser(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found in the DB");

		}
		return response;
	}

	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

	public LibraryResponse updateBook(@RequestBody BooksDetails booksDetails) {
		LibraryResponse response = new LibraryResponse();
		if (service.updateBook(booksDetails)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data modify to  the DB");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data  not modify to  the DB");
		}

		return response;
	}

    @GetMapping(path = "/requestBook/{id}/{bid}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse requestToIssue(@PathVariable("id") int id, @PathVariable("bid") int bid) {
		LibraryResponse response = new LibraryResponse();
		Boolean bean = service.requestBook(id, bid);
		if (bean) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Requseted for these Books");

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Books not requested");
		}
		return response;
	}

}
