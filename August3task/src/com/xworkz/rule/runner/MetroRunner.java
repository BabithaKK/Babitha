package com.xworkz.rule.runner;

import com.xworks.rules.implementation.TicketRules;

public class MetroRunner {
	public static void main(String[] args) {
		
  System.out.println("main method");
  TicketRules ticket=new TicketRules();
  ticket.travel();
 System.out.println(ticket.LOCATION);
}
}

