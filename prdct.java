class Product {
    // Data members
    int pcode;
    String pname;
    double price;

    // Constructor to initialize product details
    public Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
    }
}

public class prdct {
    public static void main(String[] args) {
        // Create 3 product objects
        Product product1 = new Product(101, "Product1", 250.0);
        Product product2 = new Product(102, "Product2", 180.0);
        Product product3 = new Product(103, "Product3", 300.0);

        // Initialize the product with the lowest price as product1
        Product lowestPriceProduct = product1;

        // Compare the prices to find the product with the lowest price
        if (product2.price < lowestPriceProduct.price) {
            lowestPriceProduct = product2;
        }
        if (product3.price < lowestPriceProduct.price) {
            lowestPriceProduct = product3;
        }

        // Display the product with the lowest price
        System.out.println("The product with the lowest price is:");
        lowestPriceProduct.displayProduct();
    }
}

