import java.util.Scanner;

public class Exercise14_ArraySumAndAverage {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter size: ");
			int n = sc.nextInt();

			int[] arr = new int[n];
			int sum = 0;

			for (int i = 0; i < n; i++) {
				System.out.print("Enter element " + (i + 1) + ": ");
				arr[i] = sc.nextInt();
				sum += arr[i];
			}

			double average = (double) sum / n;

			System.out.println("Sum = " + sum);
			System.out.println("Average = " + average);
		}
	}
}

