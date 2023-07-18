package com.xworkz.inheritance;

public class InstituteRunner {
	
		public static void main(String[] args) {
			Institute xworkz1 = new Xworkz("X-workz1", "BTM", 100);
			xworkz1.printInfo();
			
			System.out.println();
			
			Xworkz xworkz2 = new Xworkz("X-workz2", "Rajajinagar", 250);
			xworkz2.printInfo();

		}

	}

