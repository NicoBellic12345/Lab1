package laboratory3.ex6;

public class TestPersonAnimal {
    public static void main(String[] args) {
        // Create Persons
        Person p1 = new Person("Alice", 30, "P123");
        Person p2 = new Person("Bob", 25, "P456");

        // Create Animals
        Animal a1 = new Animal("Buddy", "Dog", 5, "A789");
        Animal a2 = new Animal("Whiskers", "Cat", 3, "A321");

        // Testing Person functionality
        System.out.println("Persons:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.communicate());
        System.out.println(p2.communicate());
        System.out.println("Comparison by age: " + p1.compareTo(p2));

        // Testing Animal functionality
        System.out.println("\nAnimals:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.communicate());
        System.out.println(a2.communicate());
        System.out.println("Comparison by age: " + a1.compareTo(a2));
    }
}
