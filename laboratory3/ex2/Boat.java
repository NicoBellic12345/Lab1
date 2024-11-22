package laboratory3.ex2;

class Boat implements Moveable {
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(name + " is sailing on water.");
    }
}