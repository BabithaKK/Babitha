package com.xworkz.CrudOperation.runner;

import com.xworkz.CrudOperation.app.PoliticianNamesRepository;
import com.xworkz.CrudOperation.app.PoliticianNamesRepositoryImpl;

public class PoliticianNamesRepositoryRunner {
	public static void main(String[] args) {
		PoliticianNamesRepository ref=new PoliticianNamesRepositoryImpl();
		ref.name("BSY");
		ref.name("Bommai");
		ref.name("Thejasvi Surya");
		ref.name("Pratham Simha");
		ref.name("Pralhad Joshi");
		
		ref.display();
	}

	
}
