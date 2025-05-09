package loops;

public class ATM {
    public int countBanknotes(int sum) {
        int banknotes = 0;
        int[] nominals ={500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < nominals.length; i++) {
           int count = sum / nominals[i];
           banknotes += count;
           sum = sum % nominals[i];
        }
        return banknotes;
    }

    public int countBanknotesWhile(int sum) {
        int banknotes = 0;
        int[] nominals = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (sum > 0 && i < nominals.length) {
            int count = sum / nominals[i];
            if (count > 0) {
                banknotes += count;
                sum = sum % nominals[i];
            }
            i++;
        }
        return banknotes;
    }


    public static void main(String[] args) {
        ATM atm = new ATM();
        int total = atm.countBanknotes(765);
        int total2 = atm.countBanknotesWhile(765);
        System.out.println("Total banknotes " + total);

    }
}