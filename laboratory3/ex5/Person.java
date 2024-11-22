package laboratory3.ex5;

import java.util.Objects;

// Base class: Person
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

// Derived class: Employee

// Derived class: Manager

