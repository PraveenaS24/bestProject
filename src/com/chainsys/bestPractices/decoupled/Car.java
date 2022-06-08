package com.chainsys.bestPractices.decoupled;

// object of this class can work with any engine, and with any wheels.
// the car classes is  decoupled from PetrolEngine class, and SteelWheell class
public class Car {
	private Iengine engine;// early bound with engine interface
	private Iwheel[] wheels;// early bound with wheel interface
	// the type of the engine, and the type of wheel will be injected to the car
	// class
	// at runtime using the constructors, this is called as constructor based
	// Dependency injunction

	public Car(Iengine engine, Iwheel[] wheels) {
		this.engine = engine;
		this.wheels = wheels;

	}

	public void startCar() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
		wheels[2].rotate();
		wheels[3].rotate();
	}

	public Iwheel[] getWheels() {
		return this.wheels;
	}

}