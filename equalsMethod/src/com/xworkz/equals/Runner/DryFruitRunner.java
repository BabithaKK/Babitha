package com.xworkz.equals.Runner;
import com.xworkz.equals.app.*;
public class DryFruitRunner {
	public static void main(String[] args) {
		System.out.println("Running main in DryFruitRunner ");
		DryFruit dry=new DryFruit(18,"Almond",3,"Dry Fruit Gallery","Tulsi Dry Fruit","10/2024");
		DryFruit dry1=new DryFruit(18,"Almond",3,"Dry Fruit Gallery","Tulsi Dry Fruit","10/2024");
		System.out.println(dry.equals(dry1));
	}

}	

