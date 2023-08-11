package com.xworkz.CrudOperation.runner;

import com.xworkz.CrudOperation.app.HospitalNamesRepository;
import com.xworkz.CrudOperation.app.HospitalNamesRepositoryImpl;

public class HospitalNamesRepositoryRunner {
	public static void main(String[] args) {
		HospitalNamesRepository hospital=new HospitalNamesRepositoryImpl();
		System.out.println("Storing hospitals in array");
		hospital.names("Jayadeva Hospital");
		hospital.names("Manipal Hospital");
		hospital.names("Apollo Hospital");
		hospital.names("Kims Hospital");
		hospital.names("Swims Hospital");
		System.out.println("Displaying all the names of hospitals");
		hospital.print();
	}

}
