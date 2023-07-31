package com.xworkz.constructor;

public class Student {
 
		
		int id;  
		String name;  
		  
		Student(){  
		System.out.println("this a default constructor");  
		}  
		  
		Student(int i, String n){  
		id = i;  
		name = n;  
		}  
		  
		public static void main(String[] args) {  
		
		Student s = new Student();  
		System.out.println("Default Constructor values");  
		System.out.println("Student Id : "+s.id + "Student Name : "+s.name);  
		  
		System.out.println("Parameterized Constructor values");  
		Student student = new Student(20, "Babitha");  
		System.out.println("Student Id : "+student.id + "Student Name : "+student.name);  
		}  
		}  

