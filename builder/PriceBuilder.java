package builder;

public interface PriceBuilder {

    static PriceBuilder price (double price ) {
        if (price < 0) return Malformed.INSTANCE;
        return new Fixed(price);
    }

    static PriceBuilder price (double maxPrice, double minPrice) {
        if (maxPrice < minPrice) return Malformed.INSTANCE;
        return new Range(maxPrice, minPrice);
    }

    class Fixed implements PriceBuilder {
        private final double price;
        private Fixed( double price ) {
            this.price = price;
        }
    }

    class Range implements PriceBuilder {
        private final double maxPrice;
        private final double minPrice;

        private Range ( double maxPrice , double minPrice ) {
            this.maxPrice = maxPrice;
            this.minPrice = minPrice;
        }
    }

    enum Malformed implements PriceBuilder { INSTANCE }
}
