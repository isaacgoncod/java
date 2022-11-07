package objeto.contato;

public class Main {

	public static void main(String[] args) {

		Contato contatos = new Contato();

		contatos.setNome("Isaac");
//		contatos.setEndereco("Rua Bernardino");
//		contatos.setTelefone("19982749381");

		Endereco end = new Endereco();

		end.setNomeRua("Rua Tassinari");
		end.setNumero("475");
		end.setComplememto("-");
		end.setCidade("Jaguariuna");
		end.setEstado("São Paulo");
		
		Telefone tel = new Telefone();
		
		tel.setTipo("Celular");
		tel.setDdd("019");
		tel.setNumero("982740381");
		
		Telefone tel2 = new Telefone();
		
		tel2.setTipo("Celular");
		tel2.setDdd("019");
		tel2.setNumero("9827488999");
		
		Telefone [] t = new Telefone();

		System.out.println(contatos.getNome());
		

		if (contatos != null && contatos.getEndereco() != null) {
			System.out.println(contatos.getEndereco());

		}
		if (contatos != null && contatos.getTelefones() != null) {
			System.out.println(contatos.getTelefones().getDdd());

		}
	}

}
