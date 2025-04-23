package PastaConteudos.Conteudos.Atv4;

public class ThreeMatriz {
        public static void main(String[] args) {
            int[][] matriz = new int[3][3];
    
            try {
                // Preenchendo a matriz
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = i + j;
                    }
                }
    
                // Imprimindo a matriz
                System.out.println("Matriz:");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Erro: Acesso a índice inválido da matriz.");
            } catch (Exception e) {
                System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        }
    }

