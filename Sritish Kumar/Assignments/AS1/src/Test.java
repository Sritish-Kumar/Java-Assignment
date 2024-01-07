
import java.io.*;

public class Test {
	public static void main(String[] args)
			throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int sum = 0;
		int i = 0;
		while (i < s.length()) {
			System.out.println(s.charAt(i) - '0');
			sum += s.charAt(i++) - '0';
			// i++;
		}
		System.out.println(sum);

	}
}
