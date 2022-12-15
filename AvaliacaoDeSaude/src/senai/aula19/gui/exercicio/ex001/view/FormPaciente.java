package senai.aula19.gui.exercicio.ex001.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import senai.aula19.gui.exercicio.ex001.dao.PacienteDAO;
import senai.aula19.gui.exercicio.ex001.model.Paciente;

public class FormPaciente extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JPanel painel;
	JLabel lbNome;
	JLabel lbPeso;
	JLabel lbAltura;
	JLabel lbResult;
	JTextField tfNome;
	JTextField tfPeso;
	JTextField tfAltura;
	JButton btAdicionar;
	JButton btLimparCampos;
	JTable taResult;
	DefaultTableModel tableModel;
	JScrollPane barraRolagem;
	PacienteDAO pd = new PacienteDAO();

	FormPaciente() {
		setTitle("Avaliação de Saúde");
		setBounds(500, 200, 640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		lbNome = new JLabel("Nome:");
		lbNome.setBounds(10, 10, 100, 30);
		painel.add(lbNome);

		tfNome = new JTextField();
		tfNome.setBounds(100, 10, 500, 30);
		painel.add(tfNome);

		lbPeso = new JLabel("Peso:");
		lbPeso.setBounds(10, 40, 100, 30);
		painel.add(lbPeso);

		tfPeso = new JTextField();
		tfPeso.setBounds(100, 40, 500, 30);
		painel.add(tfPeso);

		lbAltura = new JLabel("Altura:");
		lbAltura.setBounds(10, 70, 100, 30);
		painel.add(lbAltura);

		tfAltura = new JTextField();
		tfAltura.setBounds(100, 70, 500, 30);
		painel.add(tfAltura);

		lbResult = new JLabel("Resultado:");
		lbResult.setBounds(10, 100, 100, 30);
		painel.add(lbResult);

		btAdicionar = new JButton("Adicionar");
		btAdicionar.setBounds(290, 100, 105, 30);
		painel.add(btAdicionar);
		btAdicionar.addActionListener(this);

		btLimparCampos = new JButton("Lmp.Campo");
		btLimparCampos.setBounds(395, 100, 105, 30);
		painel.add(btLimparCampos);
		btLimparCampos.addActionListener(this);

		tableModel = new DefaultTableModel();
		tableModel.addColumn("Nome");
		tableModel.addColumn("Peso");
		tableModel.addColumn("Altura");
		tableModel.addColumn("Diagnóstico");
		preencherTabela();

		taResult = new JTable(tableModel);
		barraRolagem = new JScrollPane(taResult);
		barraRolagem.setBounds(10, 130, 600, 300);
		painel.add(barraRolagem);

	}

	public void preencherTabela() {
		for (Paciente d : pd.abrir()) {
			tableModel.addRow(d.toTable());
		}
	}

//	public void limparTabela() {
//		int tamanho = tableModel.getRowCount();
//		for (int i = 0; i < tamanho; i++)
//			tableModel.removeRow(0);
//	}

	public void limparLinha() {
		int tamanho = tableModel.getRowCount();
		tableModel.removeRow(tamanho - 1);
	}

	public void prepararArquivo() {
		int tamanho = tableModel.getRowCount();
		String saidaArquivo = "";

		for (int i = 0; i < tamanho; i++) {
			Paciente d = new Paciente(tableModel.getValueAt(i, 0).toString(), tableModel.getValueAt(i, 1).toString(),
					tableModel.getValueAt(i, 2).toString());
			saidaArquivo += d.toCSV();
		}
		pd.salvar(saidaArquivo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btLimparCampos) {
			tfNome.setText("");
			tfPeso.setText("");
			tfAltura.setText("");

		}
		if (e.getSource() == btAdicionar) {
			if (tfNome.getText().length() > 0 && tfPeso.getText().length() > 0 && tfAltura.getText().length() > 0) {
				Paciente d = new Paciente(tfNome.getText(), tfPeso.getText(), tfAltura.getText());

				tableModel.addRow(d.toTable());
				prepararArquivo();
			} else {
				JOptionPane.showMessageDialog(this, "Favor preencher todos os campos");
			}
		}
	}
}