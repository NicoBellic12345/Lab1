package laboratory3.ex6;

import java.io.Serializable;

// Animal (Pet) class implementing Comparable, Serializable, Identifiable, and Communicable
class Animal implements Comparable<Animal>, Serializable, Identifiable, Communicable {
    private String name;
    private String species;
    private int age;
    private String id;

    public Animal(String name, String species, int age, String id) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getUniqueId() {
        return id;
    }

    @Override
    public String communicate() {
        return name + " the " + species + " says: Woof (or equivalent)!";
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', species='" + species + "', age=" + age + ", id='" + id + "'}";
    }
}
