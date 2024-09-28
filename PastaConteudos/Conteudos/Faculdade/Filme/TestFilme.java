package PastaConteudos.Conteudos.Faculdade.Filme;

public class TestFilme {
    public static void main(String[] args) {
        
        Filme filme = new Filme("Jogos Vorazes", "Francis Lawrence", 2012, 2.22);

        filme.exibirDetalhes();

        if (filme.filmeClassico()) {
            System.out.println("O filme é considerado um classico.");
        } else {
            System.out.println("O filme não é considerado um classico.");
        }
    }
}
