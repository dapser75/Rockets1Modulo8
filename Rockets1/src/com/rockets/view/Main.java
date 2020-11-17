package com.rockets.view;

import com.rockets.application.RocketsApplication;

public class Main {


	private static RocketsApplication controller=new  RocketsApplication();
	
	public static void main(String[] args) throws Exception {
		
		controller.CreateRockets("x",3);
		controller.CreateRockets("LDSFJA32",6);
		controller.ViewRockets();
	}


}
