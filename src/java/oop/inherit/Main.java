package java.oop.inherit;

public class Main {
    
    public static void main(String[] args) {
        Cat cat = new Cat();

        //behaviour from animal
        cat.breathe();
        cat.hear();
        cat.move();

        //own behaviour
        cat.climbOnTree();
        cat.meow();
    }
}
