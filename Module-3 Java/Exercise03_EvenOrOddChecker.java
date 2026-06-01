import java.util.Scanner;

public class Exercise03_EvenOrOddChecker {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int n = sc.nextInt();

			if (n % 2 == 0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		}
	}
}

/*
Sample Output:
Enter a number: 8
Even
*/

