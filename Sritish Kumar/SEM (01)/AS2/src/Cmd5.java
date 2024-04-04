
public class Cmd5 {
	public static void main(String[] args) {
		int a = 1;
		int b = 10;
		int c = 100;

		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		int middle = (a + b + c) - (max + min);
		System.out.println(min + " " + middle + " " + max);
	}

}
