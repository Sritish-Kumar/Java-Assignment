import java.util.Scanner;

class Product {
    int prodId;
    int price;
    int qty;
    static int totalPrice;

    Product(int prodId, int price, int qty) {
        this.prodId = prodId;
        this.price = price;
        this.qty = qty;

    }

    void display() {
        System.out.println("Product Id: " + prodId);
        System.out.println("Price (of 1): " + price);
        System.out.println("Quantity: " + qty);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Product[] p1 = new Product[3];

        for (int i = 0; i < p1.length; i++) {
            System.out.print("Product Id: ");
            int prodId = scan.nextInt();
            System.out.print("Price: ");
            int price = scan.nextInt();
            System.out.print("Quantity: ");
            int qty = scan.nextInt();

            p1[i] = new Product(prodId, price, qty);

        }

        for (Product product : p1) {
            product.display();
            System.out.println();
            Product.totalPrice += product.price * product.qty;
        }

        System.out.println("Total Price: " + Product.totalPrice);
        scan.close();

    }
}
// OUTPUTS --------------------------------------
// Product Id: 1
// Price: 10
// Quantity: 1
// Product Id: 2
// Price:10
// Quantity:2
// Product Id: 3
// Price: 10
// Quantity: 3

// Product Id: 1
// Price (of 1): 10
// Quantity: 1

// Product Id: 2
// Price (of 1): 10
// Quantity: 2

// Product Id: 3
// Price (of 1): 10
// Quantity: 3

// Total Price: 60
