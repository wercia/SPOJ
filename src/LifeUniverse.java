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
