package kommunalka;

public class Water {
    private Month month;
    private double coldamount;
    private double hotamount;
    private double amount;
    private static final double coldfee = 2.0d;
    private static final double hotfee = 2.0d;
    private static final double fee = 2.5d;
    // double price = amount * fee;

//    public Water(Month month, double amount) {
//        this.amount = amount;
//        double price = this.amount * fee;
//        System.out.println("Voda in " + month + " costed " + price);



    public Water(Month month, double coldamount, double hotamount) {
        this.coldamount = coldamount;
        this.hotamount = hotamount;
        double coldprice = this.coldamount * coldfee;
        double hotprice = this.hotamount * hotfee;
        double totalprice = coldprice + hotprice;


        System.out.println("In " + month + " water costed:");
        System.out.println("Cold Water: " + coldprice);
        System.out.println("Hot Water" + hotprice);
        System.out.println("Total Water" + totalprice);
    }

//    public Water(Month month, double coldamount, double hotamount) {
//        this.coldamount = coldamount;
//        this.hotamount = hotamount;
//        double coldprice = this.coldamount * coldfee;
//        double hotprice = this.hotamount * hotfee;
//        double totalprice = coldprice + hotprice;
//
//
//        System.out.println("In " + month + " water costed:");
//        System.out.println("Cold Water: " + coldprice);
//        System.out.println("Hot Water" + hotprice);
//        System.out.println("Total Water" + totalprice);
//    }


    public static void main(String[] args) {
        Water January = new Water(Month.JANUARY, 10.0d, 7.5d);
        Water February = new Water(Month.FEBRUARY, 5.0d, 20.0d);

    }
}
