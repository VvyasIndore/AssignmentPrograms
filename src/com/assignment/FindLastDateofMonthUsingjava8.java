package com.assignment;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;
public class FindLastDateofMonthUsingjava8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int year =2023;
		int month =2;
		YearMonth yearmonth	=	YearMonth.of(year, month);
		int lastdate = yearmonth.lengthOfMonth();
		System.out.println("last date of month "+lastdate);
				
	}

}
