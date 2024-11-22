package laboratory3.ex5;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        // Test with Chocolate objects
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50.5),
                new Chocolate("Snickers", 60.2),
                new Chocolate("KitKat", 45.0)
        };

        System.out.println("Before Bubble Sort (Chocolates): " + Arrays.toString(chocolates));
        Sort.bubbleSort(chocolates);
        System.out.println("After Bubble Sort (Chocolates): " + Arrays.toString(chocolates));

        // Test with Time objects
        Time[] times = {
                new Time(14, 30),
                new Time(9, 15),
                new Time(14, 10)
        };

        System.out.println("\nBefore Merge Sort (Times): " + Arrays.toString(times));
        Sort.mergeSort(times);
        System.out.println("After Merge Sort (Times): " + Arrays.toString(times));

        // Test with Employee objects (from Task 4)
        Employee[] employees = {
                new Employee("Alice", 50000, new java.util.Date(120, 0, 1), "NI123"),
                new Employee("Bob", 45000, new java.util.Date(118, 5, 15), "NI456"),
                new Employee("Charlie", 70000, new java.util.Date(115, 2, 20), "NI789")
        };

        System.out.println("\nBefore Bubble Sort (Employees): " + Arrays.toString(employees));
        Sort.bubbleSort(employees);
        System.out.println("After Bubble Sort (Employees): " + Arrays.toString(employees));
    }
}