package com.xworkz.diamondProblem.falls;

public interface River extends JogFalls {
	
	
   @Override
   void water ();
	
     default void length() {
    	 System.out.println("Invoking the length");
     }
}
