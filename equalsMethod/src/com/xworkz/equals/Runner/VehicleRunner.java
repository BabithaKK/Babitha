package com.xworkz.equals.Runner;
import com.xworkz.equals.app.*;
public class VehicleRunner {


	public static void main(String[] args) {
		System.out.println("Running main in VehicleRunner");
		Vehicle temp = new Vehicle("Car", 500000, "Mysuru", "Tata motors", 4);
		Vehicle temp1 = new Vehicle("Bus", 500000, "Mysuru", "Tata motors", 4);
		System.out.println(temp.equals(temp1));
	}

}
