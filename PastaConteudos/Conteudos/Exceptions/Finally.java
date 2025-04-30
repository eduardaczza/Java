package PastaConteudos.Conteudos.Exceptions;

public class Finally {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};
 
        for (int i = 0; i < numeros.length; i++){
         try {
             System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
             
         } 
         catch (ArithmeticException | ArrayIndexOutOfBoundsException e){ //so é usado a partir do java7
             System.out.println("Ocorreu um erro");
             System.exit(0); // quando se executa esse bloco o finally não é executado 
         }

         finally {
            System.out.println("Essa linha é impressa sempre apos o try ou catch");
         }
        }
    }
}
