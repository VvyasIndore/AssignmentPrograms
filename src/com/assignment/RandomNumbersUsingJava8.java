package com.assignment;
import java.util.stream.IntStream;

public class RandomNumbersUsingJava8 {

	public static void main(String[] args) 
	{
		IntStream.range(1, 11)
        .forEach(System.out::println);
}
	}


