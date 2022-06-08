package com.chainsys.bestPractices.decoupled;

public class DieselEngine implements Iengine {
	public void start() {
        System.out.println("disel engine started");
    }
    public void stop() {
        System.out.println("disel engine stopped");
    }

}
