package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.config.BookConfigurationClass;
import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class BookMainClass {
	
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfigurationClass.class);
        Book book = context.getBean(Book.class);
        System.out.println(book.getName());               
        System.out.println(book.getPrice());
        //System.out.println(book.getAuthor().getName());
        //System.out.println(book.getAuthor().getPenName());

        Author author = context.getBean(Author.class);
        System.out.println(author.getName());
        System.out.println(author.getPenName());
        
	}

}
