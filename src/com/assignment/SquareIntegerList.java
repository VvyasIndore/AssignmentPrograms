package com.assignment;

import java.util.Arrays;
import java.util.List;

public class SquareIntegerList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		for (Integer number : numbers) {
			int square = number * number;
			System.out.println(square);
		}
	}
}