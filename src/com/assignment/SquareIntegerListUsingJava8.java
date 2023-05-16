package com.assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareIntegerListUsingJava8 
{

	public static void main(String[] args) 
	{
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        		numbers.stream()
	                .map(num -> num * num)
	                .forEach(System.out::println);
	             
	    // System.out.println(list);
	    }
	}

