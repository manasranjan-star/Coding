package com.walmart;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

class Student{
		String name;
		int mark;
		int roll;
		Student(String name,int roll,int mark){
			this.name = name;
			this.roll = roll;
			this.mark = mark;
		}
		@Override
		public String toString() {
		
		return name +":"+roll +":"+mark;
		}
		
}

public class Test2 {
	
	public static void main(String[] args) {
		//1st create Student object through Function
		Function<Student,String> function = s ->{
			int mark = s.mark;
			String grade = "";
			if(mark >= 80)
				return grade = "outstanding";
			else if(mark >= 60 && mark < 80 )
				return grade = "First class";
			else if(mark >= 30 && mark < 60 )
				return grade = "Second class";
				else
					return grade = "fail";
				
			
		};
		
		
		
		List<Student > list = new ArrayList<>();
		list.add(new Student("abc",1,85));
		list.add(new Student("xyz",5,75));
		list.add(new Student("ramu",9,25));
		list.add(new Student("manas",3,55));
		
		Consumer<Student> consumer = s ->{
		System.out.println(s.name);
		System.out.println(s.roll);
		System.out.println(s.mark);
		System.out.println(function.apply(s));
		System.out.println();
		};
		//For Printing Student
		for (Student student : list) {
//			System.out.println(student.name);
//			System.out.println(student.roll);
//			System.out.println(student.mark);
//			System.out.println(function.apply(student));
			consumer.accept(student);
			System.out.println();
		}
		
		
		
		
	}

}
