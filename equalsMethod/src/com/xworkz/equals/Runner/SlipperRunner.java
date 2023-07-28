package com.xworkz.equals.Runner;
import com.xworkz.equals.app.*;
public class SlipperRunner {
	public static void main(String[] args) {
		System.out.println("Running main in DryFruitRunner");
		Slipper slipper = new Slipper("VKC pride", 200, 7, "Female", "Black", "Leather", "High");
		Slipper slipper1 = new Slipper("Paragon", 200, 7, "Female", "Black", "Leather", "High");
		System.out.println(slipper.equals(slipper1));
	}

}

