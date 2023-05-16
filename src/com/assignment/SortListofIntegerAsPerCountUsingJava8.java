package com.assignment;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class SortListofIntegerAsPerCountUsingJava8 {

	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 3, 4, 1, 2, 5, 6, 3, 7, 8, 9, 5);

        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        List<Integer> sortedList = numbers.stream()
                .distinct()
                .sorted(Comparator.comparing((Integer num) -> frequencyMap.get(num))
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());

        System.out.println("Sorted List: " + sortedList);
    }

	}


