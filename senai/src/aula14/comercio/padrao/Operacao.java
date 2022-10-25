package aula14.comercio.padrao;

public class Operacao {

	String produto;
	int qtdComprada;
	int qtdVendida;
	float precoCompra;
	float precoVenda;

	public Operacao(String produto, int qtdComprada, int qtdVendida, float precoCompra, float precoVenda) {
		super();
		this.produto = produto;
		this.qtdComprada = qtdComprada;
		this.qtdVendida = qtdVendida;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}

	public float investimento() {

		return precoCompra * qtdComprada;
	}

	public float faturamento() {

		return precoVenda * qtdVendida;
	}

	public float lucroDinheiro() {

		return this.faturamento() - this.investimento();
	}

	public float lucroPorcentagem() {

		return this.lucroDinheiro() / this.faturamento() * 100;
	}

	public String relacaoLucro() {

		if (this.lucroDinheiro() < 0) {
			return "PREJUIZO";
		} else {
			return "LUCRO";
		}
	}

	public String toString() {
		return String.format(
				"%s  \t\t%d\t\t%d\t\t%.2f R$  \t\t%.2f R$  \t\t%.2f R$  \t\t%.2f R$  \t\t%.2f R$  \t\t%.2f %%  \t\t%s  \t\t",
				produto, qtdComprada, qtdVendida, precoCompra, precoVenda, investimento(), faturamento(),
				lucroDinheiro(), lucroPorcentagem(), relacaoLucro());
	}

}
