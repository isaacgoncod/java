package objeto.aula03;

public class Lampada {

	String tensao;
	String modelo;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	
	boolean lampadaLigada(){
		return true;
	}
	boolean lampadaDesligada(){
		return false;
	}
			
	boolean ligada = lampadaLigada();
	
	void mostrarEstado() {
		if(ligada) {
			System.out.println("Ligada");
		}else {
			System.out.println("Desligada");
		}
	}
	
	
}
