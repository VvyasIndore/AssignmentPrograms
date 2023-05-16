package com.assignment;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstIntegerStartWithOne {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 23, 14, 8, 11, 91, 42);

		Optional<Integer> firstIntegerWithPrefix = numbers.stream().filter(num -> String.valueOf(num).startsWith("1"))
				.findFirst();

		if (firstIntegerWithPrefix.isPresent()) {
			System.out.println("First Integer with Prefix 1: " + firstIntegerWithPrefix.get());
		} else {
			System.out.println("No Integer with Prefix 1 found.");
		}

	}
}