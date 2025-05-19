package Assignment;

interface EngineControl {
    void startEngine();
}

interface HeadlightControl {
    void adjustHeadlight();
}

interface MusicControl {
    void setVolume();
}

interface CarControlSystem extends EngineControl, HeadlightControl, MusicControl {
    void powerOn();
    void powerOff();
}

class SmartCarController implements CarControlSystem {
    public void startEngine() {
        System.out.println("Engine started");
    }
    public void adjustHeadlight() {
        System.out.println("Headlights dimmed");
    }
    public void setVolume() {
        System.out.println("Volume set to 10");
    }
    public void powerOn() {
        System.out.println("Car powered on");
    }
    public void powerOff() {
        System.out.println("Car powered off");
    }
}

public class demo48 {
    public static void main(String[] args) {
        SmartCarController controller = new SmartCarController();
        controller.powerOn();
        controller.startEngine();
        controller.adjustHeadlight();
        controller.setVolume();
        controller.powerOff();
    }
}
