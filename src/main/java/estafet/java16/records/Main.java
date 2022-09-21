package estafet.java16.records;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("socks", 10, true);
        System.out.println(product);

        // We can implement and use records as the follow
        record ProductFromMain(Product product, boolean discounted) {
        }
        System.out.println(new ProductFromMain(product, false));
    }
}
