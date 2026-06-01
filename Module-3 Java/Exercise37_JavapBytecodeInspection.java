public class Exercise37_JavapBytecodeInspection {

	public void display() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		new Exercise37_JavapBytecodeInspection()
				.display();
	}
}

/*
Run:

javac Exercise37_JavapBytecodeInspection.java

javap -c Exercise37_JavapBytecodeInspection

Sample Output:

Compiled bytecode displayed.
*/

