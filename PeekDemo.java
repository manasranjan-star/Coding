package com.walmart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{
	int id;
	String name;
	double salary;
	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class PeekDemo {
	

	public void whenIncrementSalaryUsingPeek_thenApplyNewSalary() {
	    Employee1[] arrayOfEmps = {
	        new Employee1(1, "Jeff Bezos", 100000.0), 
	        new Employee1(2, "Bill Gates", 200000.0), 
	        new Employee1(3, "Mark Zuckerberg", 300000.0)
	    };

	    List<Employee1> empList = Arrays.asList(arrayOfEmps);
	    
	   

}
}
