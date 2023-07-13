package com.xworkz.hospital;

public class TVRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		TV.methodStatic ();
		TV instance1 = new TV(2000);
		instance1.display();
		
		TV instance2 = new TV(3500);
		instance2.display();
		
	     
	
	}


}
