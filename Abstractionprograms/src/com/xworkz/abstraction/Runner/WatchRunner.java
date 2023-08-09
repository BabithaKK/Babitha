package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.app.AppleWatch;
import com.xworkz.abstraction.app.MainWatch;
import com.xworkz.abstraction.app.SmartWatch;

public class WatchRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Smart watch Runner\n");
		
		SmartWatch smartWatch = new AppleWatch();
		
		MainWatch main= new MainWatch(smartWatch);
		main.showTime();

	}

}

