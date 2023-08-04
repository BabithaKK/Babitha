package com.xworkz.rule.runner;

import com.xworks.rules.implementation.CustomerRules;
public class BankRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("main method");
  CustomerRules customer=new CustomerRules();
 customer.loan();
 System.out.println(customer.BANK_NAME);
}
}


