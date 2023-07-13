package com.xworkz.hospital;

public class Robot {

		static String name;
		int batteryLevel;


		static void methodStatic() {
		name ="Wall E";
		}

		Robot(int batteryLevel)
			{
				this.batteryLevel =batteryLevel;
				
		}
			void display()
			{
				 System.out.println("Static Varible : "+name);
				 System.out.println("Instance Varible : "+batteryLevel);
}
	}
