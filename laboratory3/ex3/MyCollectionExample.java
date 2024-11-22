package laboratory3.ex3;

public class MyCollectionExample {
    public static void main(String[] args) {
        // Create a collection of Strings
        MyCollection<String> stringCollection = new SimpleCollection<>();
        stringCollection.add("Hello");
        stringCollection.add("World");
        stringCollection.add("Java");

        System.out.println("Initial collection: " + stringCollection);
        System.out.println("Collection contains 'World': " + stringCollection.contains("World"));
        System.out.println("Collection size: " + stringCollection.size());

        stringCollection.remove("World");
        System.out.println("After removing 'World': " + stringCollection);
    }
}
