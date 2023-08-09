package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.Elevator;
import com.xworkz.abstraction.app.MainElevator;
import com.xworkz.abstraction.app.MallElevator;

public class ElevatorRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Elevator Runner\n");
		
		Elevator elevator = new MallElevator();
		
		MainElevator main = new MainElevator(elevator);
		main.getCarry();
	}

}
