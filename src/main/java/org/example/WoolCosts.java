package org.example;

public class Wool{
public double calculateWoolCosts() {
    double Mohair = 576.0;
    double Merino1500 = 171.0;
    double Merino750 = 166.0;

    double WoolCostSum = (Merino750 * 450) + (Merino1500 * 500) + (Mohair * (90 + 95 + 150));
return WoolCostSum;
}


    public WoolCosts {
    System.out.println("Wool cost:" + WoolCostSum);
    }
}
