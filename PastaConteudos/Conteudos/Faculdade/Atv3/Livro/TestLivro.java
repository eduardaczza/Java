package PastaConteudos.Conteudos.Atv3.Livro;

public class TestLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("A hipotese do amor", "Ali Hazelwood", 336);

        livro.obetrInfo();
        System.out.println();

        System.out.println(livro.getAutor());



    }
}
