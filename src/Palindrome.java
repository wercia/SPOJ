import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for(int i = 0; i < testCases; ++i){
		
		int number = scanner.nextInt() + 1;
		
		boolean isPalindrome = false;
		
		while (!isPalindrome) {
			String numberString = Integer.toString(number);
			int noOfDigits = numberString.length();
			String reversedNo = "";
			int cutNo = number;

			for (int power = noOfDigits - 1; power >= 0; --power) {
				int digit = (int) (cutNo / Math.pow(10, power));
				cutNo = (int) (cutNo % Math.pow(10, power));

				reversedNo = digit + reversedNo;
			}
			isPalindrome = numberString.equals(reversedNo);
			if (isPalindrome) {
				System.out.println(reversedNo);
			} else {
				++number;
			}
		}
		}
		scanner.close();
	}
}

/**
 * A positive integer is called a palindrome if its representation in the
 * decimal system is the same when read from left to right and from right to
 * left. For a given positive integer K of not more than 1000000 digits, write
 * the value of the smallest palindrome larger than K to output. Numbers are
 * always displayed without leading zeros.
 * 
 * Input
 * 
 * The first line contains integer t, the number of test cases. Integers K are
 * given in the next t lines.
 * 
 * Output
 * 
 * For each K, output the smallest palindrome larger than K.
 * 
 * Example
 * 
 * Input: 2 808 2133
 * 
 * Output: 818 2222
 */
