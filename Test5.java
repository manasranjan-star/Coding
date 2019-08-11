package com.walmart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Student1{
	String name;
	int id;
	double salary;
	Student1(int id,String name,double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

public class Test5 {
	public static void main(String[] args) {
		
		List<Student1> list = new ArrayList<>();
		list.add(new Student1(1,"manas",1234.00));
		list.add(new Student1(2,"abc",1000.00));
		list.add(new Student1(3,"pintu",2000.00));
		list.add(new Student1(4,"papu",5000.00));
		list.add(new Student1(7,"ankit",10000.00));
		list.add(new Student1(9,"prakash",20000.00));
		list.add(new Student1(5,"yatin",15000.00));
		
		//Sorting According to 1.7
		System.out.println("Sorting According to 1.7");
		Collections.sort(list,new Comparator<Student1>() {

			@Override
			public int compare(Student1 o1, Student1 o2) {
				
				return o1.name.compareTo(o2.name);
			}
			
		});
		for (Student1 student1 : list) {
			System.out.print(student1.getName()+" ");
		}
		
		//Using lambada Expression
		System.out.println();
		System.out.println("************************");
		System.out.println("Using lambada Expression");
		Collections.sort(list,(e1,e2) -> e1.name.compareTo(e2.name));
		for (Student1 student1 : list) {
			System.out.print(student1.getName()+" ");
		}
	//using Straming concept
		System.out.println();
		System.out.println("************************");
		System.out.println("using Straming concept");
		list.stream().sorted((e1,e2) -> e1.name.compareTo(e2.name)).forEach(e1 -> System.out.print(e1.getName()+" "));
		
		//Using Comaparator Static method comapring
		System.out.println();	
		System.out.println("************************");
		System.out.println("Using Comaparator Static method comapring");
		Comparator<Student1> comapartaor = Comparator.comparing(s -> s.name);
		list.sort(comapartaor);
		for (Student1 student1 : list) {
			System.out.print(student1.getName()+" ");
		}

		


		
	}

}
