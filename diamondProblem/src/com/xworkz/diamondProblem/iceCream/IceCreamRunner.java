package com.xworkz.diamondProblem.iceCream;

public class IceCreamRunner {
public static void main (String []args) {
	ChocolateIceCream chocolate =new ChocolateIceCream();
	chocolate.flavour();
	chocolate.eat();
	chocolate.color();
	
	StrawberryIceCream strawberry =new ChocolateIceCream();
	strawberry.eat();
	strawberry.flavour();
	
	VanillaIceCream vanilla =new ChocolateIceCream();
	vanilla.eat();
	vanilla.color();
	
	
}
}