import java.util.*;

class Product{
    String productName;
    int price;
    static int totalProducts = 0;

    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails(){
        System.out.println(productName + " " + price);
    }

    static void displayTotalProducts(){
        System.out.println("total products are " + totalProducts);
    }
}

public class Instp1 {
    public static void main(String[] args) {
        Product p1 = new Product("iphone", 85000);
        Product p2 = new Product("laptop", 65000);
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
