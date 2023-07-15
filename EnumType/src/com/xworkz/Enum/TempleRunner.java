package com.xworkz.Enum;

public class TempleRunner {
	public static void main(String[] args) {
	
			Temple temple=new Temple(TempleName.Iskcon);
			temple.godName="Krishna";
			temple.time(5);
			temple.display();
			
			Temple temple1=new Temple(TempleName.Thirupathi);
			temple1.godName="Venkateshwara";
			temple1.time(4);
			temple1.display();
			
		}

	}
