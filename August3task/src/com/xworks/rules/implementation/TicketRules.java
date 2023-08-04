package com.xworks.rules.implementation;

import com.xworkz.rules.app.MetroRules;

public class TicketRules implements MetroRules {

	@Override
	public void travel() {
		System.out.println("invoking travel in Metro rules");
	}

}
