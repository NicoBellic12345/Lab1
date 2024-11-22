package laboratory3.ex1;

// Define an abstract class
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Concrete method
    void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method
    abstract void makeSound();
}

// Dog class inherits from Animal

