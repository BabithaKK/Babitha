package com.xworkz.diamondProblem.fruits;

public interface Grapes  extends Fruit{

    @Override
    void color();
    default void sweet()
	 {
		System.out.println("Invoking the sweet");
		
	 }
		
	}


