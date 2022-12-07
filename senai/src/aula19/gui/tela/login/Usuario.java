package aula19.gui.tela.login;

public class Usuario {
	
	private String name;
	private String senha;
	
	public Usuario(String name, String senha) {
		super();
		this.name = name;
		this.senha = senha;
	}
	
	public boolean login(String name, String senha) {
		return true;
	}
	
}
