package nutricao.programa;

public class Paciente {

	String nome;
	float peso;
	float altura;

	public Paciente(String nome, float peso, float altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public float getImc() {
		return peso / (altura * altura);
	}

	public String getDiagnostico() {
		if(getImc() < 16) {
			return "Subpeso Severo";
			
		}if(getImc() >= 16 && getImc() <=19.9) {
			return "Subpeso";
			
		}if(getImc() >= 20 && getImc() <=24.9) {
			return "Normal";
			
		}if(getImc() >= 25 && getImc() <=29.9) {
			return "Sobrepeso";
			
		}if(getImc() >= 30 && getImc() <=39.9) {
			return "Obeso";
		}else{
			return "Obeso Mórbido";
		}
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", getImc()=" + getImc()
				+ ", getDiagnostico()=" + getDiagnostico() + "]";
	}
	
}
