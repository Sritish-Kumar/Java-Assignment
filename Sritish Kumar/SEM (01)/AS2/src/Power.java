
public class Power {
	public static void main(String[] args) {
		int n = 5;
		System.out.println("a\tb\tpow(a,b)");
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "\t" + (i + 1) + "\t" + (int) Math.pow(i, i + 1));

		}
	}

}
