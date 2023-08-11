package com.xworkz.CrudOperation.app;

public interface OlympicYearRepository {
	int TOTAL_YEARS=5;
	int years(int yearOfOlympics);
	default void display()
	{
		
	}
}
