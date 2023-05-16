package com.assignment;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDupicatefromList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

		List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println("Original list: " + numbers);
		System.out.println("List without duplicates: " + distinctNumbers);
	}

}
