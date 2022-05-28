import javax.swing.JOptionPane;

public class Main {
	public static void main (String[] Args) {
		
		String name = JOptionPane.showInputDialog("What is your name ?");
		JOptionPane.showMessageDialog(null," Your name is :"+ name);
	}

}
