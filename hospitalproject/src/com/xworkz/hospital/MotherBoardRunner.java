package com.xworkz.hospital;

class MotherBoardRunner {
	public static void main(String[]args) 
	{
		System.out.println("running main ");
		MotherBoard.methodStatic ();
		MotherBoard instance1 = new MotherBoard(2000);
		instance1.display();
		
		MotherBoard instance2 = new MotherBoard(3500);
		instance2.display();
		
	     
	
	}
}
