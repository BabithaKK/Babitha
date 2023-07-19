package com.xworkz.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		
		Shoe shoe1 = new Shoe(3500, ShoeColor.RED, ShoeSize.FOUR);
		ShoeUtil.check(shoe1);
		
		Shoe shoe2 = new Puma("Casuals", "India", 4000, ShoeColor.WHITE, ShoeSize.SIX);
		ShoeUtil.check(shoe2);
		
		Shoe shoe3 = new Nike("John Donahoe", "Cristiano Ronaldo", 5000, ShoeColor.BLACK, ShoeSize.FOUR);
		ShoeUtil.check(shoe3);
	
	}

}
