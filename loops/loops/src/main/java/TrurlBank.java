public class TrurlBank {
    public int sumQuads(int n){
        int sum = 0;
        int i = 1;
        while (i <= n){
            sum += i * i;
            i++;
        }
        return sum;
    }

    public int countSumOfDigits(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
    }
}
