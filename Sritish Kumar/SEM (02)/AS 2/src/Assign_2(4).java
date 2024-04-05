package dsa_iter;
import java.util.Scanner;

class Product{
	int prodId;
	int price;
	int quantity;
	static int totalPrice;
	
	Product(int x,int y,int z){
		this.prodId = x;
		this.price = y;
		this.quantity = z;
		this.totalPrice += y*z;
	}
	
	void display() {
		System.out.println("Total price is: "+totalPrice);
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(123,200,1);
		Product p2 = new Product(142,100,2);
		p1.display();
	}

}
