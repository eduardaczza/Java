package PastaConteudos.Conteudos.Faculdade.EDPilhas;
import java.util.Stack;

public class Pilhas {
    public static void main(String[] args) {
        Stack <String> pilha = new Stack<>();

        pilha.push("A"); //push insere um item no topo da pilha
        pilha.push("B");
        pilha.push("C");
        
        System.out.println("Topo " + pilha.peek()); // olha o topo da pilha sem fazer a remoção de nenhum elemento

        System.out.println("Removido " + pilha.pop()); // remove e retorna o elemento do topo da pilha

        System.out.println("Pilha vazia " + pilha.isEmpty()); // verifica se a pilha esta vazia
    }
}
