package kommunalka;

public class Voda {
    private Month month;
    private double amount;
    private static final double fee = 2.5d;
   // double price = amount * fee;

    public Voda(Month month, double amount) {
        this.amount = amount;
        double price = this.amount * fee;
        System.out.println("Voda in " + month + " costed " + price);
    }

    public static void main(String[] args) {
        Voda January = new Voda(Month.JANUARY,10.0d);
        Voda February = new Voda(Month.FEBRUARY, 5.0d);
    }
}
