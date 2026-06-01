import java.util.Scanner;

public class Exercise02_SimpleCalculator {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter first number: ");
			double a = sc.nextDouble();

			System.out.print("Enter second number: ");
			double b = sc.nextDouble();

			System.out.print("Enter operator (+,-,*,/): ");
			char op = sc.next().charAt(0);

			switch (op) {
				case '+' -> System.out.println("Result = " + (a + b));
				case '-' -> System.out.println("Result = " + (a - b));
				case '*' -> System.out.println("Result = " + (a * b));
				case '/' -> {
					if (b != 0)
						System.out.println("Result = " + (a / b));
					else
						System.out.println("Cannot divide by zero");
				}
				default -> System.out.println("Invalid Operator");
			}
		}
	}
}

/*
Sample Output:
Enter first number: 10
Enter second number: 5
Enter operator (+,-,*,/): +
Result = 15.0
*/

