package com.xworkz.Enum;

public class ResortRunner {

	public static void main(String[] args) {
		
		Resort resort1 = new Resort("Raj",true);
		resort1.setType(ResortType.PRESEDENTIAL_SUITE);
		resort1.display();
		
		Resort resort2 = new Resort("Ram", true);
		resort2.setType(ResortType.EXECUTIVE_SUITE);
		resort2.display();
	}

}
