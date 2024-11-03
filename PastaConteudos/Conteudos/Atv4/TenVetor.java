package PastaConteudos.Conteudos.Atv4;

public class TenVetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i*2;
        }

        System.out.println("Vetor: " );
        for (int num : vetor){
            System.out.println( num + " ");
        }
    }
}
