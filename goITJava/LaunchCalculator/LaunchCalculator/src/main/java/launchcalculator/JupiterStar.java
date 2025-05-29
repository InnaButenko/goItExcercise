package launchcalculator;

public class JupiterStar extends Spaceport{

    //космопорт JupiterStar бере фіксовану плату у 500 одиниць
    //і додатково по 2 одиниці за кожного пасажира;
    //public JupiterStar(, int passengerCount) {
    @Override
    public int calculateTotalPrice(int passengerCount){
        return 500 + passengerCount * 2;
    }
}
