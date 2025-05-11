package constructors;

class Car {
    private Door[] doors;
    //private Wheel[] wheels;

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    static class Door {

    }
}

class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Door[] doors = new Car.Door[4];
        car.setDoors(doors);
    }
}

