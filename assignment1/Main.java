import javax.swing.JOptionPane;

public class Main {
	public static void main (String[] args) {
		try {
			int output = Integer.parseInt(
				JOptionPane.showInputDialog("Input a number, fool!")
			);
			JOptionPane.showMessageDialog(null, output);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "you didn't input a number", "alert", JOptionPane.ERROR_MESSAGE);
		}
	}
}
