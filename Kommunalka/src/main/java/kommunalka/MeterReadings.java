package kommunalka;

public class MeterReadings {
    public static double calculateMonthReadings(Month month,double start, double end) {
        if(end < start){
            throw new IllegalArgumentException("end must be greater than start");
        }
        return end - start;
    }

}
