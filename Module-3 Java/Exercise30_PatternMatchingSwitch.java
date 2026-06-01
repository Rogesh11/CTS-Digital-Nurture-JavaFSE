public class Exercise30_PatternMatchingSwitch {

	static void check(Object obj) {

		switch(obj) {

			case Integer i ->
					System.out.println("Integer Type");

			case String s ->
					System.out.println("String Type");

			case Double d ->
					System.out.println("Double Type");

			default ->
					System.out.println("Unknown Type");
		}
	}

	public static void main(String[] args) {

		check(10);
		check("Hello");
		check(10.5);
	}
}

/*
Output:
Integer Type
String Type
Double Type
*/

