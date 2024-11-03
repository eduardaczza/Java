package PastaConteudos.Conteudos.Atv4;

public class TenVetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        try{
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i*2;
        }

        System.out.println("Vetor: " );
        for (int num : vetor){
            System.out.println( num + " ");
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println("Erro: Acesso a índice inválido do vetor.");
    } catch (Exception e) {
        System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
    }
  }
}
