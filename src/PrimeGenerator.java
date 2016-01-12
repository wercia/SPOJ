import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		for (int i = 1; i <= a; ++i) {
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			for (int j = b; j <= c; ++j) {
				for (int divisor = 2; divisor <= j; ++divisor) {

					if (j % divisor == 0 && j != 2) {
						break;
					}
					if (divisor == j - 1 || j == 2) {
						System.out.println(j);
						break;
					}
				}
			}
		}
		scanner.close();
	}
}
