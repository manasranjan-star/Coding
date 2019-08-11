package com.walmart;

interface Interface1{
	public void display();
}

public class Test1 implements Interface1 {

	public static void main(String[] args) {
		
		Interface1 inteface1 = new Test1();
		inteface1.display();
		//Implementing Lambda Concept
		Interface1 interface2 = () ->System.out.println("Overriding method for Lambada concept");
		interface2.display();
		//Annonymous inner class
		
		Interface1 interface3  = new Interface1() {
			public void display() {
				System.out.println("Overriding method for Annonymous inner classs");
			}
		};
		interface3.display();
		

	}

	@Override
	public void display() {
		System.out.println("Overriding method");
		
	}

}
