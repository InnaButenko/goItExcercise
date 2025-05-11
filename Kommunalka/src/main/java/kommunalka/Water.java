package kommunalka;

public class Water {
    private Month month;
    private double coldAmount;
    private double hotAmount;
    private static final double coldfee = 2.0d;
    private static final double hotfee = 2.0d;
    private double totalWaterPrice;


    public Water(Month month, double coldAmount, double hotAmount) {
        this.coldAmount = coldAmount;
        this.hotAmount = hotAmount;
        //this.totalWaterPrice = coldAmount + hotAmount;
        double coldPrice = this.coldAmount * coldfee;
        double hotPrice = this.hotAmount * hotfee;
        this.totalWaterPrice = coldAmount + hotAmount;
        //double totalWaterPrice = coldPrice + hotPrice;

//        System.out.println("In " + month + " water costed:");
//        System.out.println("Cold Water: " + coldPrice);
//        System.out.println("Hot Water" + hotPrice);
//        System.out.println("Total Water" + totalWaterPrice);
    }

    public double getTotalWaterPrice() {
        return totalWaterPrice;
    }
    //    public static void main(String[] args) {
//        double coldAmount = MeterReadings.calculateMonthReadings(Month.JANUARY,568.0, 569.0);
//        double hotAmount = MeterReadings.calculateMonthReadings(Month.JANUARY,377.0, 380.0);
//        Water January = new Water(Month.JANUARY, coldAmount, hotAmount);
//        Water February = new Water(Month.FEBRUARY, coldAmount, hotAmount);
//
//    }
}
