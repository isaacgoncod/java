package senai.aula19.gui.exercicio.ex002.controller;

import senai.aula19.gui.exercicio.ex002.dao.LoginDAO;
import senai.aula19.gui.exercicio.ex002.model.Login;

public class LoginProcess {
	
	private LoginDAO ld = new LoginDAO();
	
	public boolean sucesso(Login login) {
		boolean encontrado = false;
		for(Login l: ld.abrir()) {
			if(l.getNome().equals(login.getNome()) && l.getSenha().equals(login.getSenha()))
				encontrado = true;
		}
		return encontrado;
	}
}