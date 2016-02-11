import java.util.Scanner;

class PrimeGenerator
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();

		for (int i = 1; i <= numberOfTestCases; ++i) {
			int lowerBound = scanner.nextInt();
			int upperBound = scanner.nextInt();
			for (int number = Math.max(2, lowerBound); number <= upperBound; ++number) {
				boolean isPrime = true;
				for (int divisor = 2; divisor <= Math.sqrt(number) && isPrime; ++divisor) {
					if (number % divisor == 0 && number != divisor) {
						isPrime = false;
					}
				}
				if(isPrime) {
					System.out.println(number);
				}
			}
		}
		scanner.close();	
	}
}






