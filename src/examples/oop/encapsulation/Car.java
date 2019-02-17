package examples.oop.encapsulation;

public class Car {

    public void startEngine() {
        turnStarter();
        System.out.println("Engine started.\n");
    }

    public void stopEngine() {
        System.out.println("Engine Stopped.\n");
    }

    public void move() {
        gearUp();
        pushOnAccelerator();
        System.out.println("Car is moving.\n");
    }

    public void stop() {
        gearDown();
        brake();
        System.out.println("Car stopped.\n");
    }

    //encapsulated method
    private void turnStarter() {
        System.out.println("Starter turned.");
    }

    //encapsulated method
    private void gearUp() {
        System.out.println("Gear up.");
    }

    //encapsulated method
    private void gearDown() {
        System.out.println("Gear down.");
    }

    //encapsulated method
    private void pushOnAccelerator() {
        System.out.println("Accelerator pushed.");
    }

    //encapsulated method
    private void brake() {
        System.out.println("Braked.");
    }
}
