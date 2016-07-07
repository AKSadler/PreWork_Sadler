import java.util.Scanner;

public class ReverseProject {
	public static void main(String[] args) {
		// Create new scanner object
		Scanner input = new Scanner(System.in);
		// Output prompt to ask user to enter number
		System.out.println("Enter an integer: ");
		int value = input.nextInt();
		int result = reverse(value);
		// Output reversed integers
		System.out.println("The reverse number is " + result);
	}

	public static int reverse(int n) {
		int result = 0;
		int rem;
		//introduce while loop that will run if condition is not 0
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			result = result * 10 + rem;
		}
		return result;
	}
}


	