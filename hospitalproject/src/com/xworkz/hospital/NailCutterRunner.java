package com.xworkz.hospital;

public class NailCutterRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		NailCutter.methodStatic ();
		NailCutter instance1 = new NailCutter(20);
		instance1.display();
		
		NailCutter instance2 = new NailCutter(25);
		instance2.display();
		
	     
	
	}


}
