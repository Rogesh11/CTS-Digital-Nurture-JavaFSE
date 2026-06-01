public class Exercise07_TypeCastingExample {
	public static void main(String[] args) {

		double d = 12.75;
		int i = (int)d;

		int x = 25;
		double y = x;

		System.out.println("Double to Int: " + i);
		System.out.println("Int to Double: " + y);
	}
}

/*
Output:
Double to Int: 12
Int to Double: 25.0
*/

