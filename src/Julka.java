import java.math.BigInteger;
import java.util.Scanner;

public class Julka {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 10; ++i) {
			BigInteger nbOfApples = scanner.nextBigInteger();
			BigInteger difference = scanner.nextBigInteger();
			BigInteger nataliasApple = (nbOfApples.subtract(difference)).divide(BigInteger.valueOf(2));
			BigInteger klaudiasApples = nataliasApple.add(difference);

			System.out.println(klaudiasApples + "\n" + nataliasApple);
		}
		scanner.close();
	}
}
