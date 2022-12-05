package aula19.gui.ex001;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormularioEstrutural extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JPanel painel;
	JLabel rotuloNome;
	JLabel rotuloIdade;
	JLabel rotuloResultado;
	JTextField campoNome;
	JTextField campoIdade;
	JButton botao;
	JButton limpar;
	JTextArea areaResultado;
	String resultado = "";
	String faseDaVida;
	int idade;

	FormularioEstrutural() {
		setTitle("Entrada Processamente e Saída");

		setBounds(50, 50, 600, 400);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		painel = new JPanel();

		setContentPane(painel);

		setLayout(null);

		rotuloNome = new JLabel("Nome:");
		rotuloNome.setBounds(20, 20, 200, 30);
		painel.add(rotuloNome);

		campoNome = new JTextField();
		campoNome.setBounds(220, 20, 400, 30);
		painel.add(campoNome);

		rotuloIdade = new JLabel("Idade:");
		rotuloIdade.setBounds(20, 100, 200, 30);
		painel.add(rotuloIdade);

		campoIdade = new JTextField();
		campoIdade.setBounds(220, 100, 400, 30);
		painel.add(campoIdade);

		rotuloResultado = new JLabel("Resultado:");
		rotuloResultado.setBounds(20, 180, 200, 30);
		painel.add(rotuloResultado);

		areaResultado = new JTextArea();
		areaResultado.setBounds(220, 180, 400, 300);
		painel.add(areaResultado);

		botao = new JButton("Process");
		botao.setBounds(310, 500, 100, 50);
		painel.add(botao);
		botao.addActionListener(this);

		limpar = new JButton("Clean");
		limpar.setBounds(430, 500, 100, 50);
		painel.add(limpar);
		limpar.addActionListener(this);

		painel.setBackground(Color.LIGHT_GRAY);

	}

	public static void main(String[] args) {

		new FormularioEstrutural().setVisible(true);

		System.out.println("Este programa está funcionando");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == botao) {

			resultado += campoNome.getText() + "\t";
			resultado += campoIdade.getText() + " anos\t";
			idade = Integer.parseInt(campoIdade.getText());

			if (idade < 10) {
				faseDaVida = "Crianca";
			} else if (idade < 22) {
				faseDaVida = "Jovem";
			} else if (idade < 60) {
				faseDaVida = "Adulto";
			} else {
				faseDaVida = "Idoso";
			}
			resultado += faseDaVida + "\n";
			areaResultado.setText(resultado);

		}
		if (e.getSource() == limpar) {

			resultado = "";

			areaResultado.setText(resultado);
		}

	}

}
