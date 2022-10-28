package aula15.pesquisa;

public class Pessoa {

	String nome;
	String sobrenome;
	int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public String faseDaVida() {

		if (idade > 0 && idade < 12) {
			return "Crianca";

		}
		if (idade >= 12 && idade < 21) {
			return "Jovem";
		}
		if (idade >= 21 && idade < 60) {
			return "Adulto";

		} else {
			return "Idoso";
		}
	}

	@Override
	public String toString() {
		return String.format("%s     \t%s    \t%d\t\t%s\n", nome, sobrenome, idade, faseDaVida());
	}
	

}
