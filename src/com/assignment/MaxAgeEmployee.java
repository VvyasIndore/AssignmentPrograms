package com.assignment;
import java.util.ArrayList;
import java.util.List;

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class MaxAgeEmployee {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John", 25));
		employees.add(new Employee("Alice", 30));
		employees.add(new Employee("Bob", 28));
		employees.add(new Employee("Sarah", 32));
		employees.add(new Employee("David", 27));

		int maxAge = employees.stream().mapToInt(Employee::getAge).max().orElse(0);

		System.out.println("Maximum age: " + maxAge);
	}

}
