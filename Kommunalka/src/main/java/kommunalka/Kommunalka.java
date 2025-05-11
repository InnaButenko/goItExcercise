package kommunalka;

public class Kommunalka {

    public static void main(String[] args) {
        double coldAmount = MeterReadings.calculateMonthReadings(Month.JANUARY,568.0, 569.0);
        double hotAmount = MeterReadings.calculateMonthReadings(Month.JANUARY,377.0, 380.0);
        Water waterJanuary = new Water(Month.JANUARY, coldAmount, hotAmount);
        //Water February = new Water(Month.FEBRUARY, coldAmount, hotAmount);
        double dayElectricity = MeterReadings.calculateMonthReadings(Month.JANUARY,568.0, 569.0);
        double nightElectricity = MeterReadings.calculateMonthReadings(Month.JANUARY,377.0, 380.0);
        Electricity electricityJanuary = new Electricity(Month.JANUARY, dayElectricity, nightElectricity);
        double gasAmount = MeterReadings.calculateMonthReadings(Month.JANUARY,568.0, 569.0);
        Gas gasJanuary = new Gas(Month.JANUARY, gasAmount);
        System.out.println("Media used in January:" + "\n Water: " + waterJanuary.getTotalWaterPrice() + "\n Electricity: " + electricityJanuary.getTotalElectricityPrice() + "\n Electricity: " + gasJanuary.getGasPrice());

    }
}
