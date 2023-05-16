package com.assignment;
import java.util.ArrayList;

import java.util.*;

public class SortingIntegerList {

	public static void main(String[] args) 
	{
		List<Integer> integerList = new ArrayList<>();
		integerList.add(10);
		integerList.add(3);
		integerList.add(7);
		integerList.add(1);
		integerList.add(9);
		integerList.add(10);
		integerList.add(52);
		
		for(Integer temp: integerList)	
		{
			System.out.println(temp);
		}
		
		Collections.sort(integerList);
		
		System.out.println("After Sorting");
		
		for(Integer temp: integerList)
		{
			System.out.println(temp);
		}
	}

}
