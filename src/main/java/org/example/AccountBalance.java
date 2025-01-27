package org.example;

public class AccountBalance {
    public double getAccountBalance() {
        double accountBalance = 35.04;
        double ticketIntBiel = 19.6;
        double ticketBielInt = ticketIntBiel;
        double topUp = 30.0;
        accountBalance = accountBalance + topUp - ticketBielInt - ticketIntBiel;

        return accountBalance;
    }
    public double  countDiscount(){
        double price = 600.0;
        double discount = price * 0.7;

        return discount;
    }

    public static void main(String[] args) {
        AccountBalance account = new AccountBalance();
//        double result = account.getAccountBalance();
//        System.out.println("Updated Account Balance: " + result);

        double discount = account.countDiscount();
        System.out.println("Updated Price: " + discount);
    }

}
