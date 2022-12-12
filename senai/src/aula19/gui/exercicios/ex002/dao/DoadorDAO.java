package aula19.gui.exercicios.ex002.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class DoadorDAO {

	BufferedWriter bw;
	BufferedReader br;
	String arquivo = "./src/aula19/gui/ex002/repositories/doadores.csv";

	public void salvar(String dados) {
		try {
			bw = new BufferedWriter(new FileWriter(arquivo, true));
			bw.write(dados);
			bw.close();
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Erro ao salvar dados");
		}
	}
	public void abrir() {
		
	}
}
