package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.Laptop;
import com.xworkz.abstraction.app.LenovoLaptop;
import com.xworkz.abstraction.app.MainLaptop;

public class LaptopRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Laptop Runner\n");
		
		Laptop laptop =  new LenovoLaptop();	
	
		MainLaptop main =  new MainLaptop(laptop);
		main.getDisplay();
	
	}

}

