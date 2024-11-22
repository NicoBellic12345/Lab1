package laboratory3.ex1;

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.sleep();
        dog.makeSound();

        cat.sleep();
        cat.makeSound();
    }
}
