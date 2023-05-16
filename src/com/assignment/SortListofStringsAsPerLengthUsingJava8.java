package com.assignment;
import java.util.*;
public class SortListofStringsAsPerLengthUsingJava8 {

	public static void main(String[] args) 
	{
		List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.add("elderberry");

        strings.sort(Comparator.comparingInt(String::length));

        System.out.println("Sorted List: " + strings);
	}

}
