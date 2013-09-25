public class Half {
	/**
	 * provide console interaction for `half`
	 */
	public static void main(String[] args) {
		System.out.print("Enter a word: ");
		System.out.println("Result: " + half(System.console().readLine()));
	}

	/**
	 * @param word a String with an even number of characters
	 * @return the last half of `word`
	 */
	public static String half(String word) {
		int length = word.length();
		if (length == 0) {
			throw new IllegalArgumentException(
				"`word` cannot have 0 characters"
			);
		} else if (length % 2 != 0) {
			throw new IllegalArgumentException(
				"`word` cannot have an odd number of characters"
			);
		}
		return word.substring(length / 2);
	}
}
