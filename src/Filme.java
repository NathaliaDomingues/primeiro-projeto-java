public class Filme {
    public static void main(String[] args) {
        System.out.println("Filme: Infiltrado na Klan");

        int anoDeLancamento = 2018;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 7.5;
        //Média calculada pelas 3 notas
        double media = (9.8 + 10 + 9.9) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Infiltrado na Klan
                Em 1978, Ron Stallworth, um policial negro do Colorado, que consegue se infiltrar na Ku Klux Klan local.
                Filme ótimo!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}
