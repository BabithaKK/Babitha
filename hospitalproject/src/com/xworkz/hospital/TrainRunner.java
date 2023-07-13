package com.xworkz.hospital;

public class TrainRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		Train.methodStatic ();
		Train instance1 = new Train(400);
		instance1.display();
		
		Train instance2 = new Train(500);
		instance2.display();
		
	     
	
	}

}
