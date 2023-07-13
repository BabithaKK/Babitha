package com.xworkz.hospital;

public class CoastalRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		Coastal.methodStatic ();
		Coastal instance1 = new Coastal(200);
		instance1.display();
		
		Coastal instance2 = new Coastal(500);
		instance2.display();
		
	     
	
	}

}
