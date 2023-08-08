package com.xworkz.diamondProblem.fruits;

public interface Fruit {

    void color();
  
	 default void  season() {
		System.out.println("Invoking the season");
		 
	 }
}
