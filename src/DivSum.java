import java.util.Scanner;


public class DivSum {

	public static void main(String[] args) {
		int sumOfDivisors = 0;

		Scanner scanner = new Scanner(System.in);
		int number;
		
		while ((number = scanner.nextInt()) != 0) {

			for (int i = 1; i < number; ++i) {
				if (number % i == 0) {
					sumOfDivisors += i;
				}
			}

			System.out.println(sumOfDivisors);
			sumOfDivisors = 0;
		}
		scanner.close();
	}

}
