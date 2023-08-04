package com.xworkz.rule.runner;


import com.xworks.rules.implementation.DoctorRules;
public class HospitalRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("main method");
  DoctorRules doctor=new DoctorRules();
 doctor.cleaning();
 System.out.println(doctor.LOCATION);
}
}

