package com.xworkz.hospital;

public class ContactLens {
	static String name;
	int price;

	
	static void methodStatic() {
	name ="Dailies";
	}
	
	ContactLens(int price)
		{
			this.price =price;
			
	}
		void display()
		{
			 System.out.println("Static Varible : "+name);
			 System.out.println("Instance Varible : "+price);
		}
}

