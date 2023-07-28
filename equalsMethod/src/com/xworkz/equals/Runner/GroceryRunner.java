package com.xworkz.equals.Runner;
import com.xworkz.equals.app.*;
public class GroceryRunner {
	public static void main(String[] args) {
		System.out.println("Running main in GroceryRunner");
		Grocery grocery1 = new Grocery("Vegetables", "Super Market");
		Grocery grocery2 = new Grocery("Vegetables", "Super Market");
		boolean ref = grocery1.equals(grocery2);
		System.out.println(ref);

	}

}

