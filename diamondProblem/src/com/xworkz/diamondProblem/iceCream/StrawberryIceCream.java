package com.xworkz.diamondProblem.iceCream;

public interface StrawberryIceCream extends IceCream {
 
 @Override
  void eat();
	 default void flavour()
	 {
		System.out.println("Invoking the flavour");
		
	 }
}
