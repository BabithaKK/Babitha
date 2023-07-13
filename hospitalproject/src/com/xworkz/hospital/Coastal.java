package com.xworkz.hospital;

public class Coastal {
static String name;
double length;


static void methodStatic() {
name ="Coromandel";
}

Coastal(double length)
	{
		this.length =length;
		
}
	void display()
	{
		 System.out.println("Static Varible : "+name);
		 System.out.println("Instance Varible : "+length);
	}
}
