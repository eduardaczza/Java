package PastaConteudos.Conteudos.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Livros {

    Scanner scanner = new Scanner(System.in);
    
    private ArrayList<String> livros;
    private ArrayList<String> autor;
    private ArrayList<Double> nota;
    private ArrayList<Boolean> lido;

    public void nomeLivro(String livro){
        if (livro == null && livro.isEmpty()) {
            System.out.println("O livro não foi adicionado.");
        } else {
            livros.add(livro);
            lido.add(false);
            System.out.println("O livro foi adicionado com sucesso.");
        }
    }

    public void nomeAutor(String autor){
        System.out.println("Digite o nome do autor: ");
        String nmAutor = scanner.next();
        
        scanner.nextLine();
        if (nmAutor == null && nmAutor.isEmpty()) {
            System.out.println("O autor não foi adicionado.");
        } else {
            System.out.println(nmAutor);
            System.out.println("O nome do autor foi adicionado.");
        }
    }

  
}
