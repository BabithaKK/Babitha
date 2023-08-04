package com.xworkz.rule.runner;

import com.xworks.rules.implementation.CleaningRules;
public class HotelRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("main method");
  CleaningRules cleaning=new CleaningRules();
cleaning.eat();
 System.out.println(cleaning.LOCATION);
}
}

