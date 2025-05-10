package kommunalka;

public class Electricity {
    private double dayElectricity;
    private double nightElectricity;
    public static final double nightFee = 2.7d;
    public static final double dayFee = 4.02d;

    public Electricity(Month month, double dayElectricity, double nightElectricity) {{
            this.dayElectricity = dayElectricity;
            this.nightElectricity = nightElectricity;
            double dayPrice = this.dayElectricity * dayFee;
            double nightPrice = this.nightElectricity * nightFee;
            double totalPrice = dayPrice + nightPrice;

            System.out.println("In " + month + " electricity costed:");
            System.out.println("Day electricity: " + dayPrice);
            System.out.println("Night electricity" + nightPrice);
            System.out.println("Total electricity" + totalPrice);
        }
    }
    public static void main(String[] args) {
        double dayElectricity = MeterReadings.calculateMonthReadings(Month.JANUARY,568.0, 569.0);
        double nightElectricity = MeterReadings.calculateMonthReadings(Month.JANUARY,377.0, 380.0);
        Electricity electricity = new Electricity(Month.JANUARY, dayElectricity, nightElectricity);

    }
}
