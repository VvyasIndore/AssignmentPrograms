package com.assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employee786 {
	private String name;
	private int age;

	public Employee786(String name, int age) {
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

public class MaxAgeEmployeeUsingJava8 {

	public static void main(String[] args) {
		List<Employee786> employees = new ArrayList<>();
		// Arrays.asList(new Employee("John", 25),
		employees.add(new Employee786("vaibhva", 30));
		employees.add(new Employee786("Ram", 55));
		employees.add(new Employee786("Shyam", 20));
		employees.add(new Employee786("Mohan", 15));
		Optional<Integer> maxAge = employees.stream().map(Employee786::getAge).max(Integer::compare);

		if (maxAge.isPresent()) {
			System.out.println("Max Age: " + maxAge.get());
		} else {
			System.out.println("No employees found.");
		}
	}
}
