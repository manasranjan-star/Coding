package com.walmart;

interface interf{
	default void display() {
		System.out.println("Interface dispaly method");
	}
}
public class Test4 implements interf {
	public void display() {
		//super.
		System.out.println("Interface dispaly method for Test4");
	}
	public static void main(String[] args) {
		
		interf i = new Test4();
		i. display();
	}

}
