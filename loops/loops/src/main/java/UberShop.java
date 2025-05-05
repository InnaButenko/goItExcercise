import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for(int price: prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[] {min};
        }

        return new int[] {min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for(int price: prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for(int price: prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }

    public int[] leavePrice9(int[] prices){
        int targetLastDigit = 9;
        int count = 0;

        // 1. Считаем подходящие числа
        for (int i = 0; i < prices.length; i++) {
            if (Math.abs(prices[i] % 10) == targetLastDigit) {
                count++;
            }
        }

        // 2. Создаём массив нужного размера
        int[] result = new int[count];
        int index = 0;

        // 3. Копируем подходящие элементы
        for (int i = 0; i < prices.length; i++) {
            if (Math.abs(prices[i] % 10) == targetLastDigit) {
                result[index] = prices[i];
                index++;
            }
        }

        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){
        String[] Stocks = new String[showcaseStocks.length + warehouseStocks.length];
        for(int i = 0; i < showcaseStocks.length; i++){
            Stocks[i] = showcaseStocks[i];
        }
        for(int i = 0; i < warehouseStocks.length; i++){
            Stocks[showcaseStocks.length + i] = warehouseStocks[i];
        }
        return Stocks;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int sum = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] >= minPrice && i <= maxPrice){
                sum += prices[i];
            }
        }
        return sum;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}

