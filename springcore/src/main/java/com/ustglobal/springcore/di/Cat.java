package com.ustglobal.springcore.di;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal{
	
//	public Cat() {
//		System.out.println("Cat object created");
//	}
    public void makeSound() {
    	System.out.println("Meowwww");
    }
}
