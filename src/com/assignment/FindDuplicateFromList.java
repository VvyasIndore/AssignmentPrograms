package com.assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class FindDuplicateFromList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6, 3, 7, 8, 9, 5);

		Map<Integer, Long> frequencyMap = numbers.stream()
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));

		List<Integer> duplicates = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println("Duplicates: " + duplicates);
	}

}
