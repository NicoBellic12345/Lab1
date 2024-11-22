package laboratory3.ex3;

class SimpleCollection<T> implements MyCollection<T> {
    private java.util.ArrayList<T> elements;

    public SimpleCollection() {
        elements = new java.util.ArrayList<>();
    }

    @Override
    public void add(T element) {
        elements.add(element);
    }

    @Override
    public void remove(T element) {
        elements.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return elements.contains(element);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return "SimpleCollection{" + "elements=" + elements + '}';
    }
}