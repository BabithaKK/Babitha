package com.xworkz.hospital;

public class Engine {
	static String name;
	int price;

	
	static void methodStatic() {
	name ="Diesel Engine";
	}
	
		Engine(int price)
		{
			this.price =price;
			
	}
		void display()
		{
			 System.out.println("Static Varible : "+name);
			 System.out.println("Instance Varible : "+price);
		}
}
