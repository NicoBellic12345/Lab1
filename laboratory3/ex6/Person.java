package laboratory3.ex6;

import java.io.Serializable;

// Person class implementing Comparable, Serializable, Identifiable, and Communicable
class Person implements Comparable<Person>, Serializable, Identifiable, Communicable {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
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
        return name + " says: Hello!";
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", id='" + id + "'}";
    }
}
