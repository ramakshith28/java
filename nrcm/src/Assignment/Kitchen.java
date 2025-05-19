package Assignment;

interface Startable1 {
    void start();
}

interface Configurable {
    void configure(String setting);
}

interface ApplianceOperations extends Startable1, Configurable {
    void initialize();
}

class SmartOven implements ApplianceOperations {
    protected String model;

    public SmartOven(String model) {
        this.model = model;
    }

    @Override
    public void initialize() {
        System.out.println("Initializing Smart Oven: " + model);
    }

    @Override
    public void start() {
        System.out.println("Starting Smart Oven: " + model);
    }

    @Override
    public void configure(String setting) {
        System.out.println("Configuring " + model + " with setting: " + setting);
    }
}

class SecureSmartOven extends SmartOven {

    public SecureSmartOven(String model) {
        super(model);
    }

    public void lock() {
        System.out.println("Locking Smart Oven: " + model);
    }

    public void unlock() {
        System.out.println("Unlocking Smart Oven: " + model);
    }
}

public class Kitchen {
    public static void main(String[] args) {
        SecureSmartOven oven = new SecureSmartOven("OvenPro X200");
        oven.initialize();
        oven.start();
        oven.configure("Bake at 180°C");
        oven.lock();
        oven.unlock();
    }
}
