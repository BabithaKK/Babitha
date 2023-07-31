package com.xworkz.singleLevel;


public class AnimalRunner {
	public static void main(String[] args) {
		
		Animal cat1 = new Cat("Cat1", 20, 3);
		cat1.printInfo();
		
		System.out.println();
		
		Cat cat2 = new Cat("Cat2", 15, 2);
		cat2.printInfo();
		
	}

}

