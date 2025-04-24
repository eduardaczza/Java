package PastaConteudos.Conteudos.Exceptions;

public class MultiplosCatch {
    public static void main(String[] args) {
        //varios blocos de catchs para tratar muitas exceções de uma vez
       int[] numeros = {4, 8, 16, 32, 64, 128};
       int[] denom = {2, 0, 4, 8, 0};

       for (int i = 0; i < numeros.length; i++){
        try {
            System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
            
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir por zero");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição do array é inválida");
        }
       }
    }
}
