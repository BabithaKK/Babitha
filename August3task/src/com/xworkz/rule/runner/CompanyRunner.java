package com.xworkz.rule.runner;

import com.xworks.rules.implementation.AgreementRules;

public class CompanyRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("main method");
  AgreementRules Agreement=new AgreementRules();
  Agreement.work();
 System.out.println(Agreement.LOCATION);
}
}

