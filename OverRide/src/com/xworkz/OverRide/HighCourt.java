package com.xworkz.OverRide;

public class HighCourt extends SupremeCourt{
	void criminalCase() {
		System.out.println("Invoking criminalCase in HighCort");
	}
    void forgeryCase ()
    {
    System.out.println("Invoking forgeryCase in HighCourt");	
    }
    
    @Override
    void importantCase () {
    	System.out.println("Invoking importantCase in SupremeCourt");
    }
}
