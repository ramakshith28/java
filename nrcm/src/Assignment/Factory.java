package Assignment;

interface Startable {
    void start();
}

interface Operable {
    void operate();
}

interface Maintainable {
    void maintain();
}

interface Machine extends Startable, Operable, Maintainable {
    void reportStatus();
}

class WeldingRobot implements Machine {

    private String task;

    public WeldingRobot(String task) {
        this.task = task;
    }

    @Override
    public void reportStatus() {
        System.out.println("Welding Robot ready for operation...");
    }

    @Override
    public void start() {
        System.out.println("Starting welding task: " + task);
    }

    @Override
    public void operate() {
        System.out.println("Operating on task: " + task);
    }

    @Override
    public void maintain() {
        System.out.println("Performing maintenance on task: " + task);
    }
}

public class Factory {
    public static void main(String[] args) {
        WeldingRobot robot = new WeldingRobot("Frame Assembly");
        robot.reportStatus();
        robot.start();
        robot.operate();
        robot.maintain();
    }
}
