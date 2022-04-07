package com.america.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla noodle = new Gorilla("Noodle");
		noodle.throwSomething();
		System.out.println(noodle.displayEnergy());
		noodle.throwSomething();
		noodle.throwSomething();
		System.out.println(noodle.displayEnergy());
		noodle.eatBananas();
		noodle.eatBananas();
		System.out.println(noodle.displayEnergy());
		noodle.climb();

	}

}
