package PastaConteudos.Conteudos.Exceptions;

public class Excecao {
public static void main(String[] args) {
    //tratamento de exceções
    
    try {
        int[] vetor = new int[4];

        System.out.println("Antes da exception");

        vetor[4] = 1;

        System.out.println("Não foi impresso");
    } catch (ArrayIndexOutOfBoundsException exception) {
        System.out.println("Exceção ao acessar um indice do vetor que nao existe.");
    }

    System.out.println("Após a exception.");
}
}
