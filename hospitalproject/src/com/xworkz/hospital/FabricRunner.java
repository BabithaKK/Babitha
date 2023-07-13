package com.xworkz.hospital;

public class FabricRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		Fabric.methodStatic ();
		Fabric instance1 = new Fabric(900);
		instance1.display();
		
		Fabric instance2 = new Fabric(950);
		instance2.display();
		
	     
	
	}

}

