package com.xworkz.Chaining;

public class Employee {
	
	    int employeeId;
	    String employeeName;
	    String employeeOrg;
	
	    Employee() {
	        System.out.println(" Calling Employee class  default constructor");
	        this.employeeOrg = "Google Corporation Inc.";
	    }
	    Employee(String name) {
	 
	        this(); 
	 
	        System.out.println(" Calling Employee class parametrized constructor with argument (String)");
	        this.employeeName = name;
	    }
	}

