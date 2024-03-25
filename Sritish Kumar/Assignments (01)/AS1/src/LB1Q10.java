
public class LB1Q10 {

	public static void main(String[] args) {
		// String msg = "1";
		// System.out.println(msg);
		// msg = msg + " 2 " + msg;
		// System.out.println(msg);
		// msg = msg + " 3 " + msg;
		// System.out.println(msg);
		// msg = msg + " 4 "+ msg;
		// System.out.println(msg);

		String msg = "1";
		int i = 1;
		while (i < 5) {
			System.out.println(msg);
			i += 1;
			msg = msg + " " + i + " " + msg;

		}

	}

}
