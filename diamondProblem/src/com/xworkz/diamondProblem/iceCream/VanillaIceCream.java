package com.xworkz.diamondProblem.iceCream;

public interface VanillaIceCream extends IceCream {
	@Override
	void eat();
	 default void color()
	 {
		System.out.println("Invoking the color");
	
}
}
