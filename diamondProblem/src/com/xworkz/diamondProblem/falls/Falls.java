package com.xworkz.diamondProblem.falls;

public interface Falls {
	void water ();

	 default void name() {
		System.out.println("Invoking the name of falls");
	}
}

