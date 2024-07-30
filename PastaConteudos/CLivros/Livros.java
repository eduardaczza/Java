package PastaConteudos.CLivros;

import java.util.Scanner;

public class Livros {
    public static void main(String[] args, String livro) {
        Scanner scanner = new Scanner(System.in);

        CheckLivros clivros = new CheckLivros();

        while (true) {
            System.out.println("1. Adicionar livro");
            System.out.println("2. Marcar como lido");
            System.out.println("3. Listar livros");
            System.out.println("4. Sair");
            System.out.println("Escolha uma das opções acima ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    clivros.adicionarLivro(livro);
                    break;
                case 2:
                    System.out.println("Digite o nome do livro para marcar como lido.");
                    int indice = scanner.nextInt();
                    clivros.marcarLido(indice);
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
