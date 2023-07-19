package com.xworkz.OverRide;

public class FamilyCourt extends CivilCourt {
	void divorce () {
		System.out.println("Invoking divorce in FamilyCourt");
	}
      @Override
void propertyCase () {
	System.out.println("Invoking propertyCase in CivilCourt");

}
void theftCase () {
	System.out.println("Invoking theftCase in CivilCourt");
}
}