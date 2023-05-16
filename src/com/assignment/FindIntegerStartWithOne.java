package com.assignment;
import java.util.*;

public class FindIntegerStartWithOne {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(12);
		numbers.add(23);
		numbers.add(105);
		numbers.add(76);
		numbers.add(101);
		numbers.add(32);

		Integer firstIntegerStartingWithOne = null;

		for (Integer number : numbers) {
			String numberString = String.valueOf(number);
			if (numberString.startsWith("1")) {
				firstIntegerStartingWithOne = number;
				break;
			}
		}

		System.out.println("First integer starting with one: " + firstIntegerStartingWithOne);
	}

}
