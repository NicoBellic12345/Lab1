package laboratory3.ex5;

class Chocolate implements Comparable<Chocolate> {
    private double weight;
    private String name;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Chocolate{name='" + name + "', weight=" + weight + "}";
    }
}
