package com.ksv.study;

import java.util.Calendar;

public class DayFromDate {
	//Consider Date in dd/mm/yyyy format
	public static String getDayFromDate(String dateString){
		Calendar cldr = Calendar.getInstance();
		String[] date = dateString.split("/");
		cldr.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]),0,0);
		int day =  cldr.get(1);
		return day==0?"Sunday":(day == 1 ? "Monday":(day == 2 ? "Thusday":
			(day == 3 ? "wednessday":(day == 4 ? "Thursday":
			(day == 5 ? "Friday":"Satarday")))));
	}
	public static void main(String[] args) {
		String day = getDayFromDate("05/05/2017");
		System.out.println(day);
	}
}
