package com.xworkz.CrudOperation.runner;

import com.xworkz.CrudOperation.app.OlympicYearRepository;
import com.xworkz.CrudOperation.app.OlympicYearRepositoryImpl;

public class OlympicYearRepositoryRunner {
	public static void main(String[] args) {
		OlympicYearRepository olympic=new OlympicYearRepositoryImpl() ;
		System.out.println("Storing years of olympics in array");
		olympic.years(2002);
		olympic.years(2006);
		olympic.years(2010);
		olympic.years(2014);
		olympic.years(2018);
		System.out.println("Displaying all the years of olympics");
		olympic.display();
	}
}
