import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ex003 {

    static BufferedReader br;

    public static void main(String[] args) {

        int i = 0;
        float total = 0;
        float caro = 0;
        float barato = 1000000;
        String nomeCaro = null;
        String nomeBarato = null;

        try {
            br = new BufferedReader(new FileReader("./bd/dados2.csv"));
            String linha = br.readLine();
            while (linha != null) {
                String vetor[] = linha.split(",");
                System.out.println(vetor[0] + "\t" + vetor[1]);

                if (i != 0) {
                    float preco = 0;


                    preco = Float.parseFloat(vetor[2]);
                    if (caro < preco) {
                        caro = preco;
                        nomeCaro = linha;
                    }

                    if (barato > preco) {
                        barato = preco;
                        nomeBarato = linha;
                    }

                    total += preco;
                }
                i++;
                linha = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, erro: " + e);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo, erro: " + e);
        }

        System.out.printf("Total de preços = %.2f\n", total);
        System.out.printf("A média de preços = %.2f\n", total / i);
        System.out.println(nomeCaro);
        System.out.println(nomeBarato);

    }

}