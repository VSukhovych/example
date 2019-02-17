package examples.oop.polymorphism;

public class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("Bird is flying!");
    }
}
