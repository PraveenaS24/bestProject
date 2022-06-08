package com.chainsys.bestPractices.decoupled;

public class TestCar {

    public static void main(String[] args) {
        PetrolEngine pe = new PetrolEngine();
        SteelWheel[] sWheels = new SteelWheel[4];
        sWheels[0] = new SteelWheel();
        sWheels[0].location = "front left";
        sWheels[1] = new SteelWheel();
        sWheels[0].location = "front left";
        sWheels[2] = new SteelWheel();
        sWheels[0].location = "back left";
        sWheels[3] = new SteelWheel();
        sWheels[0].location = "back left";

        Car car = new Car(pe, sWheels);
        car.startCar();
        SteelWheel[] carWheels = (SteelWheel[]) car.getWheels();
        int length = carWheels.length;
        for (int i = 0; i < length; i++) {
            System.out.println(carWheels[i].location);
        }
        DieselEngine de = new DieselEngine();
        WoodenWheel[] wWheels = new WoodenWheel[4];
        wWheels[0] = new WoodenWheel();
        wWheels[0].location = "front left";
        wWheels[1] = new WoodenWheel();
        wWheels[1].location = "front left";
        wWheels[2] = new WoodenWheel();
        wWheels[2].location = "back left";
        wWheels[3] = new WoodenWheel();
        wWheels[3].location = "back left";

        Car car2 = new Car(de, wWheels);
        car.startCar();
        Waterengine we=new Waterengine();
        Car car3=new Car(we,wWheels);
        car3.startCar();
                

    }

}