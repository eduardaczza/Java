package PastaConteudos.Exercicos.JogoVelha;

import java.util.Scanner;

public class JgVelha2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
       JgVelha jogoJgVelha = new JgVelha();
       
       System.out.println("Jogador 1 = X");
       System.out.println("Jogador 2 = O");

       boolean ganhou = false;
       char sinal;
       int linha = 0, coluna = 0;

       while (!ganhou) {
        if (jogoJgVelha.vezJogador1()) {
            
            System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
            sinal = 'X';
        } else {
            System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
            sinal = 'O';
        }
        linha = valor("Linha", scanner);
        linha = valor("Coluna", scanner);
        
        if (!jogoJgVelha.validarJgada(linha, coluna, sinal)) {
            System.out.println("Posição ja usada, tente novamente.");
        }

        jogoJgVelha.imprimirTabuleiro();

        if (jogoJgVelha.verificarGanhador('X')) {
            
            ganhou = true;
            System.out.println("Parabéns, jogador 1 venceu!!!!");
        
        } else if (jogoJgVelha.verificarGanhador('O')) {
         
            ganhou = true;
            System.out.println("Parabéns, jogador 2 venceu!!!!");   
        } else if (jogoJgVelha.jogada > 9) {
            ganhou = true;
            System.out.println("Ninguém venceu a partida");

        }
       }
    } 

    static int valor(String tipoValor, Scanner scanner){
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scanner.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Entrada inválida, tente novamente.");
            }
        }
        valor--;
        return valor;
    }
}
