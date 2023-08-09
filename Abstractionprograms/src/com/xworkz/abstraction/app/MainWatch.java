package com.xworkz.abstraction.app;

public class MainWatch {

	private SmartWatch smartWatch;
	
	public MainWatch(SmartWatch smartWatch) {
		this.smartWatch = smartWatch;
		System.out.println("running smart watch  in Mainwatch");
	}
	
	public void showTime() {
		if(smartWatch != null) {
			System.out.println("Watch is not null");
			this.smartWatch.showTime();
		}
		else {
			System.err.println("watch is null, watch not working");
		}
	}
}
