package com.chainsys.bestPractices.decoupled;

public class WoodenWheel implements Iwheel  {
	public String location;
	public void rotate() {
		  System.out.println("Wooden wheel rotating");
	  }
	  public void stopRotation() {
		  System.out.println("Wooden wheel stopped");
	  }
	}

