
public class LB1Q7 {

	public static void main(String[] args) {
		int x = 10;
		int y = 11;
		int z = x;
		System.out.println("Before: " + x + ',' + y);
		x = y;
		y = z;
		System.out.println("After: " + x + ',' + y);

	}

}
