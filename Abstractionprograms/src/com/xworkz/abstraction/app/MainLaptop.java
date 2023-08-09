package com.xworkz.abstraction.app;

public class MainLaptop {
	private Laptop laptop;
	 
	public MainLaptop( Laptop laptop) {
		this.laptop = laptop;
	}

	public void getDisplay() {
		if(laptop!=null) {
			System.out.println("Laptop is not null");
			this.laptop.display();
			
		}
		else {
			System.err.println("laptop is null, cannot display");
		}
	}

}
