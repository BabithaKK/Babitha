package com.xworkz.OverRide;

public class CourtRunner {
  public static void main(String[] args) {
	  
	  Court court =new Court();
	  court.justice();
 
	  SupremeCourt court1 =new SupremeCourt(); 
	  court1.importantCase();
	  court1.justice();
	  
	  HighCourt court2 = new HighCourt();
	  court2.criminalCase();
	  court2.forgeryCase ();
	  court2.importantCase();
	  
	  CivilCourt court3 =new CivilCourt();
	  court3.propertyCase();
	  court3.theftCase();
	  court3.criminalCase();
	  court3.forgeryCase();
	  
	  FamilyCourt court4 =new FamilyCourt();
	  court4.divorce();
	  court4.propertyCase();
	  court4.theftCase();
	  court4.criminalCase();
    
  }
}
