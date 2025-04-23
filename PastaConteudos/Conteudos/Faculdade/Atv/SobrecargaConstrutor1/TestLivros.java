package PastaConteudos.Conteudos.Atv.SobrecargaConstrutor1;

public class TestLivros {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Trono de vidro", "Sarah J. Maas",495);
        Livro livro2 = new Livro("A rainha vermelha");

        livro1.obterInfo();
        System.out.println();
        livro2.obterInfo();
    }

}
