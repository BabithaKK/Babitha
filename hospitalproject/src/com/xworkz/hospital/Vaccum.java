package com.xworkz.hospital;

public class Vaccum {
	static String name;
	int price;

	
	static void methodStatic() {
	name ="Eureka";
	}
	
		Vaccum(int price)
		{
			this.price =price;
			
	}
		void display()
		{
			 System.out.println("Static Varible : "+name);
			 System.out.println("Instance Varible : "+price);
		}

	 
}


