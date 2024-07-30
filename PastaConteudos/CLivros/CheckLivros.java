package PastaConteudos.CLivros;

import java.util.ArrayList;

public class CheckLivros {
    private ArrayList<String> livros;
    private ArrayList<Boolean> lido;

    public CheckLivros() {
        this.livros = new ArrayList<>();
        this.lido = new ArrayList<>();
    }

    public void adicionarLivro(String livro) {
        livros.add(livro);
        lido.add(false); // coloca o livro como não lido
    }

    public void marcarLido(int indice) {
        if (indice >= 0 && indice < lido.size()) {
            lido.set(indice, true);
        } else {
            System.out.println("Indice inválido.");
        }
    }

    public void listarLivros() {
        System.out.println("Livros: ");
        for (int i = 0; i < livros.size(); i++) {
            String andamento = lido.get(i) ? " [X] " : " [ ] ";

            System.out.println(i + " " + andamento + " " + lido.get(i));
        }
    }

}
