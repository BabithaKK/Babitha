package com.xworkz.inheritance;

public class Institute {
	
		
		String name;
		String location;
		int totalStudents;
		
		public Institute(String name, String location, int totalStudents) {
			
			this.name=name;
			this.location=location;
			this.totalStudents=totalStudents;
			
		}
		
		void printInfo() {
			System.out.println("Name : "+this.name);
			System.out.println("Location : "+this.location);
			System.out.println("Total Students : "+this.totalStudents);
		}

	}

