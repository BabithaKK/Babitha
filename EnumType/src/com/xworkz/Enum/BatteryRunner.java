package com.xworkz.Enum;

public class BatteryRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery ref=new Battery("Duracel");
		ref.batteryType(BatteryType.Carbon_Zinc);
		ref.price=20500;
		ref.display();
		
		Battery ref1=new Battery("Everedy");
		ref1.batteryType(BatteryType.Silver_Oxide);
		ref1.price=30600;
		ref1.display();
	}


}
