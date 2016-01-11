import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LifeUniverse {

	public static void main(String[] args) throws Exception {

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		String s;

		while ((s = bufferedReader.readLine()) != null) {
			if (!s.equals("42")) {
				System.out.println(s);
			} else {
				break;
			}
		}
	}
}


/*
 * int[] input = { 1, 2, 88, 42, 99 }; for (int i = 0; i < input.length; ++i) {
 * if (input[i] != 42) { System.out.println(input[i]); } else { break; } }
 */
