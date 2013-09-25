import java.util.*;

public class Negate {
	/**
	 * provide console interaction for `negate`
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer value: ");
		System.out.println("Result: " + negate(console.nextInt()));
	}

	/**
	 * @param value
	 * @return the value, negated
	 */
	public static int negate(int value) {
		return -1 * value;
	}
}
