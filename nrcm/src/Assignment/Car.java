package Assignment;

interface CarInfo {
    void showDetails();
}

class Vehicle {
    String model;

    Vehicle(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Vehicle: " + model);
    }
}

class CarModel extends Vehicle implements CarInfo {
    CarModel(String model) {
        super(model);
    }

    public void showDetails() {
        System.out.println(model + " is a standard car model.");
    }
}

class LuxuryCarModel extends CarModel {
    LuxuryCarModel(String model) {
        super(model);
    }

    @Override
    public void showDetails() {
        System.out.println(model + " is a luxury car model.");
    }
}

public class Car {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Basic Vehicle");
        v.display();

        CarModel car = new CarModel("CityCar");
        car.display();
        car.showDetails();

        LuxuryCarModel luxury = new LuxuryCarModel("LuxurySUV");
        luxury.display();
        luxury.showDetails();
    }
}
