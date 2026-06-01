import java.util.Scanner;

public class Exercise04_LeapYearChecker {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter year: ");
			int year = sc.nextInt();

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				System.out.println("Leap Year");
			else
				System.out.println("Not a Leap Year");
		}
	}
}

/*
Sample Output:
Enter year: 2024
Leap Year
*/

