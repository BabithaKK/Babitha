package com.xworkz.CrudOperation.runner;

import com.xworkz.CrudOperation.app.ArmyNamesRepository;
import com.xworkz.CrudOperation.app.ArmyNamesRepositoryImpl;

public class ArmyNamesRepositoryRunner {
	public static void main(String[] args) {
		ArmyNamesRepository ref=new ArmyNamesRepositoryImpl();
		System.out.println("Storing army names in array");
		ref.army("Indian Navy");
		ref.army("Indian Air Force");
		ref.army("Indian Coast Guard");
		ref.army("Border Roads Organisation");
		ref.army("PARA");
		System.out.println("Display army names");
		ref.print();
	}
}
