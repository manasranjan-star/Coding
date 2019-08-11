package com.walmart;
class S{
	S(){
		System.out.println("S class Default comnstructor");
	}
}
interface Inter{
	S getS();
}

public class Test3 {
	
	public int perform() {
		System.out.println("Performing operation instead of Runnable class");
		int i = 0;
		for ( i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		return i ;
	}
	public static void main(String[] args) {
		
		Inter inter = S :: new;
		inter.getS();
		
	}

}
