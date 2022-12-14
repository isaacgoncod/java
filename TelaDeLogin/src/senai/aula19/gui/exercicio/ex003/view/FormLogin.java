package senai.aula19.gui.exercicio.ex003.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import senai.aula19.gui.exercicio.ex003.controller.LoginProcess;
import senai.aula19.gui.exercicio.ex003.model.Login;

public class FormLogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 2L;
	private JPanel painel;
	private JLabel lbNome;
	private JLabel lbSenha;
	private JTextField tfNome;
	private JPasswordField pfSenha;
	private JButton btLogin;
	private LoginProcess lp = new LoginProcess();

	FormLogin() {
		setTitle("Login");
		setBounds(500, 200, 510, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		lbNome = new JLabel("Nome:");
		lbNome.setBounds(20, 20, 100, 20);
		painel.add(lbNome);

		tfNome = new JTextField();
		tfNome.setBounds(120, 20, 350, 30);
		painel.add(tfNome);

		lbSenha = new JLabel("Senha:");
		lbSenha.setBounds(20, 60, 100, 20);
		painel.add(lbSenha);

		pfSenha = new JPasswordField();
		pfSenha.setEchoChar('*');
		pfSenha.setBounds(120, 60, 350, 30);
		painel.add(pfSenha);

		btLogin = new JButton("Entrar");
		btLogin.setBounds(370, 100, 100, 30);
		painel.add(btLogin);
		btLogin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btLogin) {
			if (tfNome.getText().length() > 0 && new String(pfSenha.getPassword()).length() > 0) {
				Login login = new Login(tfNome.getText(), new String(pfSenha.getPassword()));

				if (lp.sucesso(login)) {
					JOptionPane.showMessageDialog(this, "Acesso permitido");
				} else {
					JOptionPane.showMessageDialog(this, "Acesso negado");
				}

			} else {
				JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios.");
			}
		}
	}

	public static void main(String[] args) {
		new FormLogin().setVisible(true);
	}
}
