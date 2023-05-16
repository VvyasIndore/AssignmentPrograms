package com.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumValueFromList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(8);
		numbers.add(2);
		numbers.add(10);
		numbers.add(3);

		int maxValue = Collections.max(numbers);
		System.out.println("Maximum value: " + maxValue);
	}

}
