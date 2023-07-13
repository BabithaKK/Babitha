package com.xworkz.hospital;

public class CylinderrRunner 
{
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		Cylinderr.methodStatic ();
		Cylinderr instance1 = new Cylinderr(900);
		instance1.display();
		
		Cylinderr instance2 = new Cylinderr(950);
		instance2.display();
		
	     
	
	}

}



