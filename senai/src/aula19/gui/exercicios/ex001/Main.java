package aula19.gui.exercicios.ex001;

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
import javax.swing.JTable;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JPanel painel;
	JLabel rotuloNome;
	JLabel rotuloPeso;
	JLabel rotuloAltura;
	JLabel rotuloResultado;
	JTextField campoNome;
	JTextField campoPeso;
	JTextField campoAltura;
	JButton botao;
	JButton limpar;
	JTable areaResultado;

	Main() throws IOException {
		setTitle("Avaliação de Saúde");

		setBounds(100, 100, 1000, 600);

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

		rotuloPeso = new JLabel("Peso (Kg):");
		rotuloPeso.setBounds(20, 100, 200, 30);
		painel.add(rotuloPeso);

		campoPeso = new JTextField();
		campoPeso.setBounds(220, 100, 400, 30);
		painel.add(campoPeso);

		rotuloAltura = new JLabel("Altura (M):");
		rotuloAltura.setBounds(20, 180, 200, 30);
		painel.add(rotuloAltura);

		campoAltura = new JTextField();
		campoAltura.setBounds(220, 180, 400, 30);
		painel.add(campoAltura);

		rotuloResultado = new JLabel("Resultados:");
		rotuloResultado.setBounds(150, 250, 200, 30);
		painel.add(rotuloResultado);

		botao = new JButton("Calcular");
		botao.setBounds(400, 220, 100, 50);
		painel.add(botao);
		botao.addActionListener(this);

		limpar = new JButton("Limpar");
		limpar.setBounds(520, 220, 100, 50);
		painel.add(limpar);
		limpar.addActionListener(this);

		painel.setBackground(Color.LIGHT_GRAY);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == botao) {
			Paciente p = new Paciente(campoNome.getText(), campoPeso.getText(), campoAltura.getText());

			try {
				BufferedWriter bw = new BufferedWriter(
						new FileWriter("./src/aula19/gui/avaliacao_de_saude/bd/paciente.csv", true));
				bw.write(p.toCSV());
				bw.close();

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == limpar) {

			campoNome.setText("");
			campoPeso.setText("");

			campoAltura.setText("");
		}

	}

	public static void main(String[] args) throws IOException {

		new Main().setVisible(true);

		System.out.println("Este programa está funcionando");
	}
}
