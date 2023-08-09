package com.xworkz.abstraction.app;

public class MainKidney {
private Kidney kidney;
	
	public MainKidney(Kidney kidney) {
		this.kidney = kidney;
		System.out.println("Kidney arguement constructor of MainKidney");
	}

	public void check() {
		if(kidney!=null) {
			System.out.println("kidney is not null");
			this.kidney.clean();
		}
		else {
			System.err.println("Kidney is null, kidney not working...");
		}
	}
}

