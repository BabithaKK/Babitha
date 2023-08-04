package com.xworkz.rule.runner;

import com.xworks.rules.implementation.WardenRules;

public class HostelRunner {
	public static void main(String[] args) {
		
  System.out.println("main method");
  WardenRules warden=new WardenRules();
 warden.Restrictions();
 System.out.println(warden.LOCATION);
}
}


