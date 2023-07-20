package com.xworkz.Chicken;

public class ChickenRunner {
		public static void main(String[] args) {
			Chicken ref1 = new Chicken(80,"Mysore");
			ref1.printInfo();
			System.out.println("running main in chicken");

			Chicken ref2 = new FarmChicken(90,"bengaluru",30,"Owner");
			ref2.printInfo();
			System.out.println("running main in farmChicken");
			
			Chicken ref3 = new BoilerChicken(65,"farm",false,3);
			ref3.printInfo();
			System.out.println("running main in boilerChicken");
		}

	}

