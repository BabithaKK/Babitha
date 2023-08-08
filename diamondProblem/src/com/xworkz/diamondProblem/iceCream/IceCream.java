package com.xworkz.diamondProblem.iceCream;

public interface IceCream {
	void  eat();
    default void taste() 
    {
    	System.out.println("Invoking the taste");
}

}