package com.xworkz.hospital;

public class ContactLensRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		ContactLens.methodStatic ();
		ContactLens instance1 = new ContactLens(1000);
		instance1.display();
		
		ContactLens instance2 = new ContactLens(1500);
		instance2.display();
		
	     
	
	}

}
