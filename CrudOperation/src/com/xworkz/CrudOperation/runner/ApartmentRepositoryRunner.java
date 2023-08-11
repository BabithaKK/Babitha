package com.xworkz.CrudOperation.runner;

import com.xworkz.CrudOperation.app.ApartmentRepository;
import com.xworkz.CrudOperation.app.ApartmentRepositoryImpl;

public class ApartmentRepositoryRunner {
	public static void main(String[] args) {
		ApartmentRepository ref=new ApartmentRepositoryImpl();
		System.out.println("Storing apartment names in array");
		ref.name("Gorgeous Apartment");
		ref.name("Greenwood Apartment");
		ref.name("Goldefeet Apartment");
		ref.name("Perfect Place Apartment");
		ref.name("New era Apartment");
		System.out.println("Displaying all the names of Apartments");
		ref.display();

}
}
