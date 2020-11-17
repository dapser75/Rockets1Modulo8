package com.rockets.project;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	private String rocketid;
	private int boosternumber;
	private List<Booster> boostersinrocket=new ArrayList();	
	
	//Método de contrucción
	public Rocket (String rocketid, int boostersnumber) throws Exception {
		this.rocketid=rocketid;
		this.boosternumber=boostersnumber;
	}
	
	public void AddBoosters(List<Booster> boosterlist) throws Exception{
		if(boosternumber == boosterlist.size()) { //Chequeamos que no superemeros el numero máximo de cohetes a añadir
			for (int i=0;i<boosterlist.size();i++) {
				boostersinrocket.add(boosterlist.get(i));
			}
		}
		else {
			System.out.println("\nESTE COHETE TIENE QUE MONTAR "+ boosternumber + "PROPULSORES Y QUIERES MONTAR"+ boosterlist.size() );
		}
		
	}

	
	//*******************************    METEODOS GETTERS     *******************************//
	public String getRocketid() {
		return rocketid;
	}


	public int getBoosterNumber() {
		return boosternumber;
	}

	
	
	
	
}
