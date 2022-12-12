package aula19.gui.exemplos.ex001;

import javax.swing.JOptionPane;

public class Exemplo {

	public static void main(String[] args) {

//		System.out.println("Teste");
//
//		JOptionPane.showMessageDialog(null, "Hello");
//
//		String texto1 = "Isaac";
//		JOptionPane.showMessageDialog(null, texto1);

		String texto2 = JOptionPane.showInputDialog("Digíte seu nome completo:");

		String nomes[] = texto2.split(" ");
		texto2 = "Seu primeiro nome possui " + nomes[0].length() + " letras\n";

		if (nomes.length > 2) {
			texto2 += "Seu primeiro nome do meio possui " + nomes[1].length() + " letras\n";

			if (nomes.length > 3) {
				texto2 += "Seu segundo nome do meio possui " + nomes[2].length() + " letras\n";
			}
			if (nomes.length > 4) {
				texto2 += "Seu terceiro nome do meio possui " + nomes[3].length() + " letras\n";
			}
			if (nomes.length > 5) {
				texto2 += "Seu quarto nome do meio possui " + nomes[4].length() + " letras\n";
			}
		} else {
			texto2 += "Você não possui nome do meio";
		}

		texto2 += "Seu último nome possui " + nomes[nomes.length - 1].length() + " letras \n";

		JOptionPane.showMessageDialog(null, texto2);
	}

}
