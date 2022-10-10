package nutricao.programa;

public class Paciente {
	
	String nome;
	float peso;
	float altura;
	
	Paciente(String setNome, float setPeso, float setAltura){
		nome = setNome;
		peso = setPeso;
		altura = setAltura;	
	}
	
	public float getImc() {
		return peso / (altura * altura);
	}
	
	public String getDiagnostico() {
		if(getImc() < 16) {
			return "Subpeso Severo";
			
		}if(getImc() >= 16 || getImc() <=19) {
			
		}
	}
}
