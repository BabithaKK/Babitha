package com.xworkz.hospital;

public class Hospital {
	static String name;
	String branch;
	String chiefdoctor;
	
	void displayInstance() {
		System.out.println(this.branch);
		System.out.println(this.chiefdoctor);
		
		displaystatic();
		
	}
 static String displaystatic () {
	 System.out.println(name);
return name;	 
 }
}
