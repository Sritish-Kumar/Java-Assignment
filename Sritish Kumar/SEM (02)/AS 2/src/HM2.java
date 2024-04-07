import java.util.Scanner;

class Book {
    String BName;
    int BEdition;
    float BPrice;

    Book(String name, int edition, float price) {
        BName = name;
        BEdition = edition;
        BPrice = price;
    }

    void showData() {
        System.out.println("BOOK NAME: " + BName);
        System.out.println("BOOK EDITION: " + BEdition);
        System.out.println("BOOK PRICE: " + BPrice);

    }

    Book getMax(Book[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].BPrice > arr[index].BPrice) {
                index = i;
            }

        }
        return arr[index];

    }
}

public class HM2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book[] books = new Book[3];
        for (int i = 0; i < books.length; i++) {
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Edition: ");
            int ed = scan.nextInt();
            System.out.print("Price: ");
            float price = scan.nextFloat();
            scan.nextLine();

            books[i] = new Book(name, ed, price);

        }
        System.out.println("* book with the maximum price *");
        books[0].getMax(books).showData();

    }
}

// OUTPUT

// Name: Outlander
// Edition: 5
// Price: 5000
// Name: The Last Kingdom
// Edition: 2
// Price: 2500
// Name: Eragul
// Edition: 4
// Price: 2000
// * book with the maximum price *
// BOOK NAME: Outlander
// BOOK EDITION: 5
// BOOK PRICE: 5000.0
