package methods;

public class Engine {
    private int power;
    private String fuelType;

    public Engine(int power, String fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }
    public Engine() {}

    public int getPower() {
        return power;
    }


    public void setPower(int power) {
        this.power = power;
    }
    public String getFuelType() {
        return fuelType;
    }

//    public static void main(String[] args) {
//        Engine engine = new Engine(50000, "A500");
//        System.out.println(engine.getFuelType());
//    }
}
