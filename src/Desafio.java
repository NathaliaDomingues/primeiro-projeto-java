public class Desafio {
    public static void main(String[] args) {
        //1
        double n1 = 1.2;
        double n2 = 7.1;
        double media = (n1 + n2) / 2;
        System.out.println("A média é: " + media);

        //2
        double numeroDecimal = 3.2;
        int numeroInteiro = (int) numeroDecimal;
        System.out.println(numeroInteiro);

        //3
        char letra = '#';
        String frase = "carro";
        System.out.println(letra + frase);

        //4
        double precoProduto = 10;
        int quantidade = 30;
        System.out.println(precoProduto * quantidade);

        //5
        double valorEmDolares = 10;
        double valorReal = valorEmDolares * 4.94;
        System.out.println(valorReal);

        //6
        double precoOriginal = 50;
        double percentualDesconto = 700;
        System.out.println(precoOriginal - percentualDesconto / 100);
    }
}