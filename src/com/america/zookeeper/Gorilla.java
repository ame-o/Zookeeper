package com.america.zookeeper;

public class Gorilla extends Mammal {
	public String name;
	
	//constructor
	public Gorilla(String name) {
		super();
		this.setName(name);
	}
	
	public void throwSomething() {
		super.setEnergyLevel(super.getEnergyLevel() - 5);
		System.out.println(this.getName()+" threw something and decreased their energy by 5.");
	}
	
	public void eatBananas() {
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println(this.getName()+" ate a banana and is happy and their energy increased by 10.");
	}
	
	public void climb() {
		this.setEnergyLevel(this.getEnergyLevel()-10);
		System.out.println(this.getName()+" climbed a tree and decresed their energy by 10.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
