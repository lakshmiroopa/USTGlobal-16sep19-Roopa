package com.ustglobal.springcore.di;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Animal{
	
//	public Dog() {
//		System.out.println("Dog oobject created");
//	}
	
	public void makeSound() {
		System.out.println("Bowwwww");
	}

}
