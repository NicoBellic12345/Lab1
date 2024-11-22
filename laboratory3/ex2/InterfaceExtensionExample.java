package laboratory3.ex2;

public class InterfaceExtensionExample {
    public static void main(String[] args) {
        // Create instances
        Vehicle car = new Car("Tesla Model S", 250);
        Moveable boat = new Boat("Sea Cruiser");

        // Use the objects
        car.move();
        System.out.println("Max speed: " + car.getMaxSpeed() + " km/h");

        boat.move();
    }
}
