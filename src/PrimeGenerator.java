import java.util.Scanner;

// sito Eratostenesa

public class PrimeGenerator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = sc.nextInt();

		for (int i = 1; i <= numberOfTestCases; ++i) {
			int lowerBoundary = sc.nextInt();
			int upperBoundary = sc.nextInt();

			boolean[] numbers = new boolean[upperBoundary + 1];

			for (int k = 2; k <= upperBoundary; ++k) {
				numbers[k] = true;
			}

			for (int nextPrime = 2; nextPrime <= upperBoundary; ++nextPrime) {
				if (numbers[nextPrime]) {
					for (int j = (nextPrime * 2); j <= upperBoundary; j += nextPrime) {
						numbers[j] = false;
					}
				}
			}
			for (int j = lowerBoundary; j <= upperBoundary; ++j) {
				if (numbers[j]) {
					System.out.printf("%d %n", j);
				}
			}
			System.out.println("\n");
		}

		sc.close();
	}
}
