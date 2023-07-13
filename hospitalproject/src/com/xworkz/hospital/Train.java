package com.xworkz.hospital;

public class Train {
	static String name;
	double length;


	static void methodStatic() {
	name ="Shathabdi";
	}

	Train(double length)
		{
			this.length =length;
			
	}
		void display()
		{
			 System.out.println("Static Varible : "+name);
			 System.out.println("Instance Varible : "+length);
		}
}
