package laboratory3.ex4;

import java.util.Date;

public class EmployeeManagerTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000, new Date(120, 0, 1), "NI123");
        Employee e2 = new Employee("Bob", 45000, new Date(118, 5, 15), "NI456");
        Manager m1 = new Manager("Charlie", 70000, new Date(115, 2, 20), "NI789", 10000);

        m1.addTeamMember(e1);
        m1.addTeamMember(e2);

        System.out.println("Manager details:");
        System.out.println(m1);

        System.out.println("\nEmployees:");
        System.out.println(e1);
        System.out.println(e2);

        System.out.println("\nComparisons:");
        System.out.println("e1 vs e2 by salary: " + e1.compareTo(e2));
        System.out.println("m1 vs e1 by salary/bonus: " + m1.compareTo(e1));

        System.out.println("\nSorting by name:");
        java.util.ArrayList<Employee> employees = new java.util.ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(m1);

        employees.sort(new NameComparator());
        employees.forEach(System.out::println);

        System.out.println("\nSorting by hire date:");
        employees.sort(new HireDateComparator());
        employees.forEach(System.out::println);

        System.out.println("\nCloning test:");
        Manager clonedManager = m1.clone();
        System.out.println("Original Manager: " + m1);
        System.out.println("Cloned Manager: " + clonedManager);
    }
}
