package laboratory3.ex2;

class Car implements Vehicle {
    private String model;
    private int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println(model + " is driving on the road.");
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}