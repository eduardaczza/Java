package PastaConteudos.CLivros;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckLivros {  
    private ArrayList<String> livros;
    private ArrayList<Boolean> lido;
    public boolean livro;

    public CheckLivros() {
        this.livros = new ArrayList<>();
        this.lido = new ArrayList<>();

    }

    public void adicionarLivro(String livro) {
        if (lido == null) {
            System.out.println("A leitura não foi completada.");
        } else {
            livros.add(livro);
            lido.add(false);
            System.out.println("Leitura concluída.");
            
        }
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

    private static int obterOpacao(Scanner scanner){
        int opcao = -1;
        try {
            opcao = scanner.nextInt();
            scanner.nextLine();

        } catch(InputMismatchException e){
            scanner.nextLine();
            System.out.println("Tentativa inválida, digite um número.");
        }
        return opcao;
    }

    private static int obterIndice(Scanner scanner){
        int indice = -1;
        try {
                indice = scanner.nextInt();
                scanner.nextLine();
        } catch (InputMismatchException e){
            scanner.nextLine();
            System.out.println("Tentativa inválida, digite um número para validação.");
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CheckLivros clivros = new CheckLivros();

        while (true) {
            System.out.println("1. Adicionar livro");
            System.out.println("2. Marcar como lido");
            System.out.println("3. Listar livros");
            System.out.println("4. Sair");
            System.out.println("Escolha uma das opções acima ");
            int opcao = obterOpacao(scanner);
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    String livro = scanner.nextLine();
                    clivros.adicionarLivro(livro);
                    break;
                case 2:
                if (clivros.livro) {
                    System.out.println("Nem um livro lido.");
                } else {
                    clivros.listarLivros();
                    System.out.println("Digite o indice do livro para marcar como lido.");
                    int indice = obterIndice(scanner);
                    clivros.marcarLido(indice);
                }
                break;
                case 3:
                    clivros.listarLivros();
                    break;
                case 4: 
                    System.out.println("Concluído. Saindo..");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

