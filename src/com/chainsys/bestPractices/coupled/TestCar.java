package com.chainsys.bestPractices.coupled;

public class TestCar {

	public static void main(String[] args) {
       Car car=new Car();
       car.startCar();
      SteelWheel[] carWheel=car.getWheels();
      int length=carWheel.length;
      for(int i=0;i<length;i++)
      {
    	  System.out.println(carWheel[i].location);
      }
	}

}
