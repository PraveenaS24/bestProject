package com.chainsys.bestPractices.decoupled;

public class Waterengine implements Iengine {

	@Override
	public void start() {
		System.out.println("water engine started");
	}

	@Override
	public void stop() {
		System.out.println("water engoine stopped");
	}

}
