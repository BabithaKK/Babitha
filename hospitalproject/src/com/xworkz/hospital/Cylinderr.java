package com.xworkz.hospital;

public class Cylinderr {
	static String name;
	int price;

	
	static void methodStatic() {
	name ="HP";
	}
	
		Cylinderr(int price)
		{
			this.price =price;
			
	}
		void display()
		{
			 System.out.println("Static Varible : "+name);
			 System.out.println("Instance Varible : "+price);
		}

	 
}



    