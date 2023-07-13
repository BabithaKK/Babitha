package com.xworkz.hospital;

public class EngineRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		Engine.methodStatic ();
		Engine instance1 = new Engine(100);
		instance1.display();
		
		Engine instance2 = new Engine(150);
		instance2.display();
		
	     
	
	}

}


