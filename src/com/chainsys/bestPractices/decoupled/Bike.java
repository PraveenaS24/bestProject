package com.chainsys.bestPractices.decoupled;

// object of this class can work with any engine, and with any wheels.
// the car classes is  decoupled from PetrolEngine class, and SteelWheell class
public class Bike {
	private Iengine engine;// early bound with engine interface
	public Iengine getEngine() {
		return engine;
	}
	//The type of engine will be injected to the bike class
	//At runtime using the setter method. This is called as setter based 
	//dependency injection
	public void setEngine(Iengine engine) {
		this.engine = engine;
	}
	//The type of wheel will be injected to the bike class
		//At runtime using the setter method. This is called as setter based 
		//dependency injection
	public void setWheels(Iwheel[] wheels) {
		this.wheels = wheels;
	}

	private Iwheel[] wheels;// early bound with wheel interface
	// the type of the engine, and the type of wheel will be injected to the car
	// class
	// at runtime using the constructors, this is called as constructor based
	// Dependency injunction

//	public Bike(Iengine engine, Iwheel[] wheels) {
//		this.engine = engine;
//		this.wheels = wheels;

	//}

	public void startBike() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
		
	}

	public Iwheel[] getWheels() {
		return this.wheels;
	}

}