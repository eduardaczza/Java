package PastaConteudos.Conteudos.AtvGylles.Livro;

public class TestLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A hipotese do amor", "Ali Hazelwood", 336);
        Livro livro2 = new Livro("Amêndoas", " Won-pyung Sohn", 288);

        livro1.obterInfo();
        System.out.println();

        livro2.obterInfo();
        System.out.println();

       // System.out.println("Autor 1: " + livro1.autor);
    }
}
