import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println(filme);

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite uma avaliação:");
        double avaliacao = leitura.nextDouble();

        System.out.println("Então seu filme favorito é " + filme + " e foi lançado em " + anoDeLancamento + ", foi avaliado em " + avaliacao);
    }
}