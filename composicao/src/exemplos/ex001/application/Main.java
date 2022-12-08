package exemplos.ex001.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exemplos.ex001.entities.Colaborador;
import exemplos.ex001.entities.ContratoHora;
import exemplos.ex001.entities.Departamento;
import exemplos.ex001.enums.TrabalhoNivel;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite o nome do departamento: ");
		String departamentoNome = scan.nextLine();

		System.out.println("Digite os dados do colaborador: ");
		System.out.printf("Nome: ");
		String colaboradorNome = scan.nextLine();

		System.out.printf("Nivel: ");
		String colaboradorNivel = scan.nextLine();

		System.out.printf("Salario Base: ");
		double colaboradorSalarioBase = scan.nextDouble();

		Colaborador colaborador = new Colaborador(colaboradorNome, TrabalhoNivel.valueOf(colaboradorNivel),
				colaboradorSalarioBase, new Departamento(departamentoNome));

		System.out.println("Digite quantos contratos tera o colaborador: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do #" + i + " contrato: ");
			System.out.printf("Data (DD/MM/YYYY): ");
			Date contratoData = sdf.parse(scan.next());

			System.out.print("Valor por hora: ");
			double valorPorHora = scan.nextDouble();

			System.out.print("Duracao (horas): ");
			int horas = scan.nextInt();

			ContratoHora contrato = new ContratoHora(contratoData, valorPorHora, horas);
			colaborador.addContrato(contrato);
		}

		System.out.println();

		System.out.printf("Digite o mes e ano para calcular o salario final (MM/YYYY): ");
		String mesAno = scan.next();

		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));

		System.out.println("Nome: " + colaborador.getNome());
		System.out.println("Departamento: " + colaborador.getDepartamento().getNome());
		System.out.println(
				"Salario final ate " + mesAno + ": " + String.format("%.2f", colaborador.salarioFinal(ano, mes)));
		scan.close();
	}

}
