package senai.aula19.gui.exercicio.ex002.model;

public class Login {

	private String nome;
	private String senha;

	public Login() {

	}

	public Login(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	public Login(String linha) {
		this.nome = linha.split(";")[0];
		this.senha = linha.split(";")[1];
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

}
