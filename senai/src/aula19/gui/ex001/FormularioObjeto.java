package aula19.gui.ex001;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormularioObjeto extends JFrame implements ActionListener {
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

	FormularioObjeto() {
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

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == botao) {
			Pessoa p = new Pessoa(campoNome.getText(), campoIdade.getText());
			areaResultado.setText(p.toString());
			
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("./src/aula19/gui/ex001/bd/dados.csv", true));
				bw.write(p.toCSV());
				bw.close();
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == limpar) {

			campoNome.setText("");
			campoIdade.setText("");

			areaResultado.setText("");
		}

	}

	public static void main(String[] args) {

		new FormularioObjeto().setVisible(true);

		System.out.println("Este programa está funcionando");
	}
}
