package com.america.zookeeper;

public class Gorilla extends Mammal {
	private String name;
	
	//constructor
	public Gorilla(String name) {
		this.setName(name);
	}
	
	public void throwSomething() {
		super.setEnergyLevel(super.getEnergyLevel() - 5);
		System.out.println(this.getName()+" threw something and decreased their energy by 5.");
	}
	
	public void eatBananas() {
		super.setEnergyLevel(getEnergyLevel() + 10);
		System.out.println(this.getName()+" is happy and their energy increased by 10.");
	}
	
	public void climb() {
		super.setEnergyLevel(getEnergyLevel()-10);
		System.out.println(this.getName()+"climbed a tree and decresed their energy by 10.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
