import java.util.Scanner;

public class Exercise15_StringReversal {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter String: ");
			String str = sc.nextLine();

			String reversed = new StringBuilder(str).reverse().toString();

			System.out.println("Reversed String: " + reversed);
		}
	}
}

/*
Sample Output:
Enter String: Hello
Reversed String: olleH
*/

