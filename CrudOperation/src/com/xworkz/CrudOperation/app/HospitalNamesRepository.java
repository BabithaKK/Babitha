package com.xworkz.CrudOperation.app;

public interface HospitalNamesRepository {
	int TOTAL_HOSPITALS=5;
	String names(String hospitalName);
	default void print()
	{
		
	}
}
