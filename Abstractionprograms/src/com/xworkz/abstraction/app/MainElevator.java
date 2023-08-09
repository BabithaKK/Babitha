package com.xworkz.abstraction.app;

public class MainElevator {
private Elevator elevator;
	
	public MainElevator(Elevator elevator) {
		this.elevator = elevator;
	}

	public void getCarry() {
		if(elevator!=null) {
			System.out.println("Elevator is not null");
			this.elevator.carry();
		}
		else {
			System.err.println("Elevator is null, cannot carry");
		}
	}
}
