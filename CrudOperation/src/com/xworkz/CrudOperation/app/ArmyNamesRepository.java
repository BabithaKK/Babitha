package com.xworkz.CrudOperation.app;

public interface ArmyNamesRepository {
	int TOTAL_NAMES=5;
	String army(String armyNames);
	default void print()
	{
		
	}
}
