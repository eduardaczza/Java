package PastaConteudos.Conteudos.CheckList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = new ArrayList<>();
        List<Boolean> feito = new ArrayList<>();

        while (true) {
            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1. Adicionar compromisso.");
            System.out.println("2. Marcar como feito.");
            System.out.println("3. Mostrar compromissos.");
            System.out.println("4. Fechar a lista.");
            int opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao) {
                case 1:
                System.out.println("Digite o nome do compromisso ");
                String itemNome = scanner.nextLine();
                addItem(items, feito, itemNome);
                break;
               
                case 2:
                System.out.println("Selecione número do compromisso feito ");
                int compFeito = scanner.nextInt();
                completeItem(feito, compFeito);
                break;
               
                case 3:
                showItens(items, feito);
                System.out.println(items);
                break;
               
                case 4:
                System.out.println("Lista fechada.");
                scanner.close();
                return;

                default:
                System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void addItem(List<String> items, List<Boolean> feito, String itemNome){
        items.add(itemNome);
        feito.add(false);
    }

    public static void completeItem(List<Boolean> feito, int compFeito){
        if (compFeito >= 0 && compFeito < feito.size()) {
            feito.set(compFeito, true);
        } else {
            System.out.println("Item inválido.");
        }
    }

    public static void showItens(List<String> items, List<Boolean> feito){
        for (int i = 0; i > items.size(); i++){
            System.out.println(i + " ." + (feito.get(i)? " [X] " : " [ ]" + items.get(i)));
        }
    
    }

    }
