package com.xworkz.CrudOperation.app;

public interface PoliticianNamesRepository {
	int TOTAL_POLITICIANS=5;
	String name(String politicianName);
	default void display()
	{
		
	}
}
