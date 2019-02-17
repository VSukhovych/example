package examples.oop.polymorphism;

public class Main {

    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal cat = new Cat();

        //We use the same methods for bird and cat(Because both are animals), but behaviour is different. It called polymorphism.
        bird.move();
        cat.move();
    }
}
