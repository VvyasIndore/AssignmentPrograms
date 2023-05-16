package com.assignment;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValueFromListUingJava8 {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 1, 9, 4);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        if (max.isPresent()) {
            System.out.println("Max Value: " + max.get());
        } else {
            System.out.println("List is empty.");
        }
	}

}
