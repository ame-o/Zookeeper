package com.america.zookeeper;

public class Mammal {
	private  int energyLevel;
	
	//	constructor
	public Mammal() {
		this.energyLevel = 100;
		System.out.println("I'm a mammal.");
	}
	
	//	methods
	public int displayEnergy() {
		System.out.println("Energy level is: "+ getEnergyLevel());
		return energyLevel;
	}
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	// getters and setters
	
}
