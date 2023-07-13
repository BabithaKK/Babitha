package com.xworkz.hospital;

public class VaccumRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		Vaccum.methodStatic ();
		Vaccum instance1 = new Vaccum(900);
		instance1.display();
		
		Vaccum instance2 = new Vaccum(950);
		instance2.display();
		
	     
	
	}

}


