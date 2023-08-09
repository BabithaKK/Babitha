package com.xworkz.abstraction.app;

public class MainPrinter {
private PrintingMachine machine;
	
	public MainPrinter(PrintingMachine machine) {
		this.machine = machine;
	}

	
	public void getPrint() {
		if(machine!=null) {
			System.out.println("Machine is not null");
			this.machine.print();
		}
		else {
			System.err.println("machine is null cannot print");
		}
	}
}

