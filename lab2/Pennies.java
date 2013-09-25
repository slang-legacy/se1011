import java.util.*;

public class Pennies {
	/**
	 * provide console interaction for `pennies`
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a dollar amount: ");
		System.out.println("Result: " + pennies(console.nextDouble()));
	}

	/**
	 * @param value a value in dollars
	 * @return the value in pennies
	 */
	public static int pennies(double value) {
		return (int) (100 * value);
	}
}
