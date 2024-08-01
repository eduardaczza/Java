package PastaConteudos.Conteudos.Livro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Livros {

    static Scanner scanner = new Scanner(System.in);
    
    private ArrayList<String> livros;
    private ArrayList<Boolean> lido;
    public boolean livro;

    public void nomeLivro(String livro){
        if (livro == null) {
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
        if (nmAutor == null) {
            System.out.println("O autor não foi adicionado.");
        } else {
            System.out.println(nmAutor);
            System.out.println("O nome do autor foi adicionado.");
        }
    }

    public void notaLivro(int nota){
        if (nota >= 4) {
            System.out.println("Bom/Favoritado");
        } else {
        System.out.println("Deu para o gasto/Ruim/Péssimo");    
        }
    }

    public void livroLido(int marcar){
        if (marcar >= 0 && marcar < lido.size()) {
            lido.set(marcar, true);
        } else {
            System.out.println("Marcação não encontrada.");
        }
    }

    public void listaLivros(){
        System.out.println("Livros: ");
        for(int i = 0; i< livros.size(); i++){
            String andamento = lido.get(i) ? " [X] " : " [ ]";

            System.out.println(i + " " + andamento + " " + lido.get(i));
        }
    }

    private static int obtOpc(Scanner scanner){
        int opc = -1;
        try {
            opc = scanner.nextInt();
            scanner.nextLine();
        } catch(InputMismatchException e){
            scanner.nextLine();
            System.out.println("Tentativa inválida, digite um número para validação do livro.");
        }
        return opc;
    }

    private static int obtMarca(Scanner scanner){
        int marca = -1;
        try{
            marca = scanner.nextInt();
            scanner.nextLine();
        } catch(InputMismatchException e){
            scanner.nextLine();
            System.out.println("Tentativa inválida, digite um número para validação da posição de marcação.");
        }
        return marca;
    }

    public static void main(String[] args) {
        Livros clivros = new Livros();

        while (true) {
            System.out.println("1. Adicionar nome do livro");
            System.out.println("2. Adicionar nome do autor");
            System.out.println("3. Adicionar nota do livro");
            System.out.println("4. Marcar como lido");
            System.out.println("5. Mostrar lista de livros");
            System.out.println("6. Sair da lista");
            int opcao = obtOpc(scanner);
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    String livro = scanner.nextLine();
                    clivros.nomeLivro(livro);
                    break;
                
                case 2:
                    System.out.println("Digite o nome do autor: ");
                    String autor = scanner.nextLine();
                    clivros.nomeAutor(autor);
                    break;

                case 3:
                    System.out.println("Digite a nota de 0 a 5: ");
                    int nota = scanner.nextInt();
                    clivros.notaLivro(nota);
                    break;

                case 4:
                    if (clivros.livro) {
                        System.out.println("Nenhum livro lido");
                    } else {
                        clivros.listaLivros();
                        System.out.println("Digite o número do livro para a marcação. ");
                        int marca = obtMarca(scanner);
                        clivros.livroLido(marca);
                    }
                    break;

                case 5:
                    clivros.listaLivros();
                    break;

                case 6:
                    System.out.println("Lista finalizada.");
                    scanner.close();
                    break;
            
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
        } 
    }
  
}
