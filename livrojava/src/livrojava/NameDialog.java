package livrojava;

import javax.swing.JOptionPane;

public class NameDialog {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		String message = String.format("Bem-vindo(a), %s, ao Java.", name);
		
		JOptionPane.showMessageDialog(null, message);
	}
}
