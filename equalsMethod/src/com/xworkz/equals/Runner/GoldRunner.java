package com.xworkz.equals.Runner;
import com.xworkz.equals.app.*;
public class GoldRunner {
	public static void main(String[] args) {
		System.out.println("Running main in GoldRunner");
		Gold ref = new Gold(6000, "Latest", "Joyalukas", "Madikeri");
		Gold ref1 = new Gold(6000, "Latest", "Joyalukas", "Madikeri");
		System.out.println(ref.equals(ref1));
	}

}

