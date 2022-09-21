package estafet.java16.records;
/*
What we get from this definition
 - Constructor
 - Methods as equals/hashCode/toString
 - Accessors methods: name(), price(), inStock()

 Records are Immutable & Final data
  */

public record Product(String name, int price, boolean inStock) {
    public Product {
        if (price < 0) {
            throw new IllegalArgumentException();
        }
    }

}
