package com.xworkz.hospital;

public class RobotRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		Robot.methodStatic ();
		Robot instance1 = new Robot(40);
		instance1.display();
		
		Robot instance2 = new Robot(50);
		instance2.display();
		
	     
	
	}

}
