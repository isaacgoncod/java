package exemplos.ex001.application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		int contNegativo = 0;

		System.out.println("Digite quantas linhas e colunas a matriz irá ter :");
		n = scan.nextInt();

		int[][] mat = new int[n][n];

		System.out.println("Numeros que irão compor a matriz:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = scan.nextInt();
			} 
		}
		
		System.out.println("Diagonal principal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					contNegativo++;
				}
			} 
		}
		
		System.out.println("Quatidades de numeros negativos da matriz: " + contNegativo);

		scan.close();

	}

}
