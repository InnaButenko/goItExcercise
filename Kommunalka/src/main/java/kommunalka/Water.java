package kommunalka;

public class Water {
    private Month month;
    private double coldAmount;
    private double hotAmount;
//    private double amount;
    private static final double coldfee = 2.0d;
    private static final double hotfee = 2.0d;


    public Water(Month month, double coldAmount, double hotAmount) {
        this.coldAmount = coldAmount;
        this.hotAmount = hotAmount;
        double coldPrice = this.coldAmount * coldfee;
        double hotPrice = this.hotAmount * hotfee;
        double totalPrice = coldPrice + hotPrice;

        System.out.println("In " + month + " water costed:");
        System.out.println("Cold Water: " + coldPrice);
        System.out.println("Hot Water" + hotPrice);
        System.out.println("Total Water" + totalPrice);
    }


    public static void main(String[] args) {
        double coldAmount = MeterReadings.calculateMonthReadings(Month.JANUARY,568.0, 569.0);
        double hotAmount = MeterReadings.calculateMonthReadings(Month.JANUARY,377.0, 380.0);
        Water January = new Water(Month.JANUARY, coldAmount, hotAmount);
        Water February = new Water(Month.FEBRUARY, coldAmount, hotAmount);

    }
}
