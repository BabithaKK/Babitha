package com.xworkz.diamondProblem.falls;

public interface JogFalls  extends Falls{
 @Override
	void water();
	 
   default void  height()
   {
	   System.out.println("Invoking the height");
	  
   }
	   
   }
	
 