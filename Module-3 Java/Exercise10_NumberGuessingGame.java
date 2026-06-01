import java.util.Random;
import java.util.Scanner;

public class Exercise10_NumberGuessingGame {

	public static void main(String[] args) {

		Random random = new Random();
		int target = random.nextInt(100) + 1;
		int guess;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.print("Guess number (1-100): ");
				guess = sc.nextInt();

				if (guess > target)
					System.out.println("Too High");
				else if (guess < target)
					System.out.println("Too Low");
				else
					System.out.println("Correct!");
			} while (guess != target);
		}
	}
}

