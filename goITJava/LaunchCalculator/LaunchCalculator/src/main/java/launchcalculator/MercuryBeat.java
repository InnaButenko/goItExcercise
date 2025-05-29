package launchcalculator;

public class MercuryBeat extends Spaceport{
    @Override
    public int calculateTotalPrice(int passengerCount){
        return passengerCount * 15;
    }
    //космопорт MercuryBeat не бере фіксованої плати за зліт,
    // але бере по 15 одиниць за кожного пасажира;
}
