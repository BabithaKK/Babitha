package com.xworkz.hospital;

public class RopeRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		Rope.methodStatic ();
		Rope instance1 = new Rope(200);
		instance1.display();
		
		Rope instance2 = new Rope(250);
		instance2.display();
		
	     
	
	}


}
