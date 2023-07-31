package com.xworkz.Chaining;

	public class PermanentEmployee extends Employee {
	
	    PermanentEmployee(int id, String name) {
	 
	        super(name); 
	 
	        System.out.println(" Calling PermanentEmployee Inside parametrized constructor "
	                                                   +" with (int, String)");
	        this.employeeId = id;
	    }

	void displayEmployeeInfo() {
	System.out.println("Employee details:Orgnaization: " + employeeOrg + "Id: " + employeeId + "Name: " + employeeName + "");
	    }
	 
	    public static void main(String args[]) {
	
	        System.out.println("Creating and displaying permanent employee details");
	 
	        PermanentEmployee permanentEmp = new PermanentEmployee(19, "Rahul Dravid");
	        permanentEmp.displayEmployeeInfo();
	 
	        System.out.println("******************************************************************");
	    }
	}

