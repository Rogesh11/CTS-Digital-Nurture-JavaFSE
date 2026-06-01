import java.util.Arrays;
import java.util.List;

public class Exercise28_StreamAPI {

	public static void main(String[] args) {

	List<Integer> numbers =
				Arrays.asList(1,2,3,4,5,6,7,8);

		numbers.stream()
				.filter(n -> n % 2 == 0)
				.forEach(System.out::println);
	}
}

/*
Output:
2
4
6
8
*/

