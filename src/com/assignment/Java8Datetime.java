package com.assignment;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Java8Datetime {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd");
		DateTimeFormatter yearFormatter	= DateTimeFormatter.ofPattern("yyyy");
		DateTimeFormatter monthFormatter =DateTimeFormatter.ofPattern("MM");
		String formattedDate = now.format(dateFormatter);
		String yearFormatted = now.format(yearFormatter);
		String monthFormatted = now.format(monthFormatter);
		int	date =	Integer.valueOf(formattedDate);	
		int year =	Integer.valueOf(yearFormatted);
		int month = Integer.valueOf(monthFormatted);
		YearMonth yearmonth	=	YearMonth.of(year, month);
		int lastdate = yearmonth.lengthOfMonth();
		System.out.println("Current Date  " + formattedDate);
		System.out.println("Current Year"   +yearFormatted );
		System.out.println("Last date of Month" +lastdate);
	}

}
