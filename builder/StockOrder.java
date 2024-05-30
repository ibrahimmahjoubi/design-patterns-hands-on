package builder;

public interface StockOrder {
    void sell(String symbol, int quantity, PriceBuilder price);
    void buy(String symbol, int quantity, PriceBuilder price);
}
