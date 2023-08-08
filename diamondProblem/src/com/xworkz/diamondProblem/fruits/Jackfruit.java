package com.xworkz.diamondProblem.fruits;

public interface Jackfruit  extends Fruit{
	
@Override
void color();
    
   default void size() {
	System.out.println("Invoking the size");
	   
   }
    
	
}
