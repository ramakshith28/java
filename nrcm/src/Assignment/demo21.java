package Assignment;

interface Driveable {
    void driveVehicle();
}

interface FlyableVehicle {
    void flyVehicle();
}

class Waterborne {
    void floatInWater() {
        System.out.println("Floating smoothly on water");
    }
}

class Transport extends Waterborne implements Driveable, FlyableVehicle {
    public void driveVehicle() {
        System.out.println("Moving forward on the road");
    }

    public void flyVehicle() {
        System.out.println("Fly high in the sky");
    }
}

class AutonomousTransport extends Transport {
    void activateAutopilot() {
        System.out.println("Autopilot system engaged!");
    }
}

public class demo21 {
    public static void main(String[] args) {
        AutonomousTransport vehicle = new AutonomousTransport();
        vehicle.driveVehicle();
        vehicle.flyVehicle();
        vehicle.floatInWater();
        vehicle.activateAutopilot();
    }
}
