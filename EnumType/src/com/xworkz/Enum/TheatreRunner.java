package com.xworkz.Enum;

public class TheatreRunner {
	public static void main(String[] args) {
		
		Theatre theatre=new Theatre("Orian");
		theatre.movieName="Googly";
		theatre.typeOfTheatre(TheatreType.NON_AC);
		theatre.display();
		Theatre theatre1=new Theatre("Inox");
		theatre1.movieName="KGF";
		theatre1.typeOfTheatre(TheatreType.AC);
		theatre1.display();
	}

}

