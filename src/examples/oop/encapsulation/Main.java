package examples.oop.encapsulation;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        car.startEngine();
        car.move();
        car.stop();
        car.stopEngine();

        //Can't use this method, because it encapsulated
        //car.turnStarter();
    }
}
