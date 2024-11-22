package laboratory3.ex3;

// Interface: MyCollection
interface MyCollection<T> {
    void add(T element);        // Add an element to the collection
    void remove(T element);     // Remove an element from the collection
    boolean contains(T element); // Check if the collection contains an element
    int size();                 // Get the size of the collection
}

// Implementation: SimpleCollection


