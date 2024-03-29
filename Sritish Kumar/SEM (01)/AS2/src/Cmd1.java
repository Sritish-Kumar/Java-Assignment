public class Cmd1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		boolean r = false;
		if (a <= b * c)
			r = true;

		else if (b <= a * c)
			r = true;

		else if (c <= a * b)
			r = true;

		System.out.println(r);
		// System.out.println(a+" "+b+" "+c);
		// boolean r = false;
		//
		// r=(a<=b*c)?true : false;
		// r=(b<=a*c)?true : false;
		// r=(c<=a*c)?true : false;
		//
		//
		// System.out.println(r);

	}

}
