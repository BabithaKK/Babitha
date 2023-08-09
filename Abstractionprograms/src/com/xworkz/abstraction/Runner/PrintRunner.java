package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.LaserPrintingMachine;
import com.xworkz.abstraction.app.MainPrinter;
import com.xworkz.abstraction.app.PrintingMachine;

public class PrintRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Printing machine runner\n");
		
		PrintingMachine machine = new LaserPrintingMachine();
		
		MainPrinter main = new MainPrinter(machine);
		main.getPrint();

	}

}
