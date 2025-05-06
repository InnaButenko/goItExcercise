import java.util.Arrays;
public class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        StringBuilder stocksBuilder = new StringBuilder();
        for (int i = 0; i < stocks.length; i++) {
            String[] parts = stocks[i].split(" ");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);

            if(price<200){
                if (stocksBuilder.length()>0){
                    stocksBuilder.append(" ");
                }
                stocksBuilder.append(name);
            }
        }
        return stocksBuilder.toString();
    }
}
