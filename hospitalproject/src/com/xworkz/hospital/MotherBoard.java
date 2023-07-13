package com.xworkz.hospital;

public class MotherBoard {
	static String model;
	int price;


	static void methodStatic() {
	model ="AT MotherBoard";
	}

	MotherBoard(int price)
		{
			this.price =price;
			
	}
		void display()
		{
			 System.out.println("Static Varible : "+model);
			 System.out.println("Instance Varible : "+price);
		}
	
}


