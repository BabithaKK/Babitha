package com.xworkz.OverRide;

public class CivilCourt extends HighCourt{
void propertyCase()
{
	System.out.println("Invoking propertyCase in CivilCourt");
	
}
void theftCase() {
	System.out.println("Invoking theftCase in CivilCourt ");

}

   @Override
 void criminalCase() {
		System.out.println("Invoking criminalCase in HighCourt ");

}

   void forgeryCase() {
		System.out.println("Invoking forgeryCase in HighCourt ");
}
}