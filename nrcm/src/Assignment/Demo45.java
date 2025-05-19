package Assignment;

interface LandVehicle {
    void drive();
}

class Vehicle1 {
    void info() {
        System.out.println("Vehicles are used for transportation");
    }
}

class Car1 extends Vehicle1 implements LandVehicle {
    public void drive() {
        System.out.println("Car is driving on the road");
    }
    void honk() {
        System.out.println("Car is honking");
    }
}

class AirTransport {
    void type() {
        System.out.println("Planes and helicopters fly in the air");
    }
}

class Helicopter extends AirTransport {
    void name() {
        System.out.println("This is a helicopter");
    }
}

public class Demo45 {
    public static void main(String[] args) {
        Car1 car = new Car1();
        Helicopter heli = new Helicopter();

        car.drive();
        car.info();
        car.honk();

        heli.type();
        heli.name();
    }
}
