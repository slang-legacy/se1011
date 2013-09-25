import java.util.*;

public class Initialization {
	/**
	 * provide console interaction for `init_code`
	 */
	public static void main(String[] args) {
		System.out.print("Enter a name: ");
		String name = System.console().readLine();
		
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer value: ");
		int value = console.nextInt();

		System.out.println("Result: " + init_code(name, value));
	}

	/**
	 * @param name The name of the variable
	 * @param value The starting value of the variable
	 * @return An initialization of an int with the given name and value
	 */
	public static String init_code(String name, int value) {
		return String.format("int %s = %s;", name, value);
	}
}
