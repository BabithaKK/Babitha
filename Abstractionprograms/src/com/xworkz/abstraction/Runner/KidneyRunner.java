package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.HumanKidney;
import com.xworkz.abstraction.app.Kidney;
import com.xworkz.abstraction.app.MainKidney;

public class KidneyRunner {
	public static void main(String[] args) {
		System.out.println("Runnin main in Kidney Runner\n");
		
		
		Kidney kid = new HumanKidney();
		
		MainKidney main = new MainKidney(kid);
		main.check();
		
	}

}
