public class Product {
    int pcode;
    String pname;
    double price;

    public Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 800.0);
        Product product2 = new Product(102, "Smartphone", 500.0);
        Product product3 = new Product(103, "Tablet", 300.0);

        Product lowestPriceProduct = product1;

        if (product2.price < lowestPriceProduct.price) {
            lowestPriceProduct = product2;
        }

        if (product3.price < lowestPriceProduct.price) {
            lowestPriceProduct = product3;
        }

        System.out.println("Product with the lowest price:");
        System.out.println("Product Code: " + lowestPriceProduct.pcode);
        System.out.println("Product Name: " + lowestPriceProduct.pname);
        System.out.println("Product Price: " + lowestPriceProduct.price);
    }
}
