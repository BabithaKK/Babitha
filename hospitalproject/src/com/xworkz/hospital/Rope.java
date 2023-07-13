package com.xworkz.hospital;

public class Rope {
	static String name;
	double length;


	static void methodStatic() {
	name ="Cotton";
	}

	Rope(double length)
		{
			this.length =length;
			
	}
		void display()
		{
			 System.out.println("Static Varible : "+name);
			 System.out.println("Instance Varible : "+length);
		}
	
}
