
public class CmdDigitSum {
	public static void main(String[] args) {
		int n = 1234;
		int f = n % 10;
		int l = 0;
		n = n / 10;
		while (n > 0) {
			l = n % 10;
			n = n / 10;
		}
		System.out.println("sum: " + (l + f));
	}

}
