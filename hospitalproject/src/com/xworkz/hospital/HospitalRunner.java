package com.xworkz.hospital;

public class HospitalRunner {
	public static void main(String[]args) {
		System.out.println("running main");
		Hospital ref =new Hospital();
	ref.name ="name1";
	ref.branch ="bng1";
	ref.chiefdoctor ="doctor1";
	
	ref.displayInstance();
	
	Hospital ref1 =new Hospital();
	ref1.branch ="bng2";
	ref1.chiefdoctor = "doctror2";
	ref1.displayInstance();
	
	Hospital ref2 =new Hospital();
	ref2.branch ="bng3";
	ref2.chiefdoctor = "doctror3";
	ref2.displayInstance();

	
	
	}

}
