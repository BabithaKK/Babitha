package com.xworkz.rule.runner;

import com.xworks.rules.implementation.BanglooreAirportRules;

public class AirportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("main method");
  BanglooreAirportRules airport=new BanglooreAirportRules();
 airport.travel();
 System.out.println(airport.LOCATION);
}
}
