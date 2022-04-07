package com.america.zookeeper;

public class Bat extends Mammal {
	
	// constructor
	public Bat() {
		super.setEnergyLevel(300);
			
	}
	
	//methods
	public void fly() {
		super.setEnergyLevel(super.getEnergyLevel()-50);
		System.out.println("(3 lightning strikes, flap! flap!) The bat is out flying!");
	}
	public void eatHumans() {
		super.setEnergyLevel(getEnergyLevel()+25);
	}
	public void attackTown() {
		super.setEnergyLevel(getEnergyLevel()-100);
		System.out.println("Burn Baby Burn!The bat attacks the town!");
	}

}
