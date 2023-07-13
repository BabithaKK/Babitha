package com.xworkz.hospital;

public class Fabric {
		static String name;
		int price;

		
		static void methodStatic() {
		name ="Cotton";
		}
		
			Fabric(int price)
			{
				this.price =price;
				
		}
			void display()
			{
				 System.out.println("Static Varible : "+name);
				 System.out.println("Instance Varible : "+price);
			}

		 
	}

