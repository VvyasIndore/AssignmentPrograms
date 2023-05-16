package com.assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfIntegerUsingJava8 {

	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 1, 9, 4);

        //List<Integer> sortedList = numbers.stream()
				//.sorted()
               // .collect(Collectors.toList());
				numbers.stream().sorted().forEach(System.out::println);
				//System.out.println("Sorted List: " + sortedList);
	}

}
