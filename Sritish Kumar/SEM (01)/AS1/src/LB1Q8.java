
public class LB1Q8 {

	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		System.out.println("Before: " + x + ',' + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After: " + x + ',' + y);

	}

}
