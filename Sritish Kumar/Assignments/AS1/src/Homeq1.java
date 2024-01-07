public class Homeq1 {

	public static void main(String[] args) {

		int w = 1;
		int g = 2;
		int k = 3;
		int a = 4;

		System.out.print("Before: ");
		System.out.println("W :" + w + " G: " + g + " K: " + k + " A: " + a);

		// Without using extra variable

		// g = w+g+k+a;
		//
		// w = g-(w+k+a);
		// a = g-(w+k+a);
		// k = g-(w+k+a);
		// g = g-(w+a+k);
		// System.out.print("After: ");
		// System.out.println("W :"+w+" G: "+g+" K: "+k+" A: "+a );

		// with using extra variable

		int extra = w;

		w = g;
		g = k;
		k = a;
		a = extra;
		System.out.print("After: ");
		System.out.println("W :" + w + " G: " + g + " K: " + k + " A: " + a);

	}

}
