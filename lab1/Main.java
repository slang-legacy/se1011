import javax.swing.*; 

public class Main { 
	public static void main(String[] args) {
		System.out.println("hello world on the console!!");
		JOptionPane.showMessageDialog(null, "Hello world in a frame!");
		
		//get input from console and do something with it
		System.out.print("Enter something: ");
		String input = System.console().readLine();
		System.out.println(
			String.format("you entered \"%s\", just in case you forgot ;)", input)
		);
	}
}
