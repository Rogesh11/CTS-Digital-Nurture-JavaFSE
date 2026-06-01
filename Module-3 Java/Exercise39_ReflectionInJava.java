import java.lang.reflect.Method;

class Sample {

	public void show() {
		System.out.println("Reflection Method Invoked");
	}
}

public class Exercise39_ReflectionInJava {

	public static void main(String[] args) {

		try {

			Class cls =
					Class.forName("Sample");

			Object obj =
					cls.getDeclaredConstructor()
							.newInstance();

			Method method =
					cls.getMethod("show");

			method.invoke(obj);

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
Sample Output:

Reflection Method Invoked
*/

