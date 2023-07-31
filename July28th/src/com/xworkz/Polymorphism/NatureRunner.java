package com.xworkz.Polymorphism;

public class NatureRunner {
public static void main(String []args) {
	
	Nature nature =new Nature();
	nature.weather();
	
	River nature1 = new River ();
	nature1.riverName();
	nature1.weather();
	
	Seasons nature2 =new Seasons ();
	nature2.nameOfTheSeason();
	nature2.riverName();
	nature2.weather();
	
	
}
}
