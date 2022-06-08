package com.chainsys.bestPractices.decoupled;

public class SteelWheel implements Iwheel {
	public String location;

	public void rotate() {
		System.out.println("Steel wheel rotating");
	}

	public void stopRotation() {
		System.out.println("Steel wheel stopped");
	}
}
