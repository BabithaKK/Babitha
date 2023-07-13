package com.xworkz.hospital;

public class TV {
	static String name;
	int price;


	static void methodStatic() {
	name ="Samsung";
	}

	TV(int price)
		{
			this.price =price;
			
	}
		void display()
		{
			 System.out.println("Static Varible : "+name);
			 System.out.println("Instance Varible : "+price);
		}
	
}

