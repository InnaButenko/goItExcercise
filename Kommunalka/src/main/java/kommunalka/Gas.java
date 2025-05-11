package kommunalka;

public class Gas {
    public static final double gasFee = 7.0d;
    private double gasAmount;

    public Gas(Month month, double gasAmount) {
        this.gasAmount = gasAmount;
        double gasPrice = gasFee * gasAmount;
        System.out.println("In " + month + " gas costed:");
        System.out.println("Gas: " + gasPrice);

    }
//    public static void main(String[] args) {
//        double gasAmount = MeterReadings.calculateMonthReadings(Month.JANUARY,568.0, 569.0);
//        Gas gas = new Gas(Month.JANUARY, gasAmount);
//
//
//    }
}
