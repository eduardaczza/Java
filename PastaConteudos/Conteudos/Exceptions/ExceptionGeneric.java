package PastaConteudos.Conteudos.Exceptions;

public class ExceptionGeneric {

    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
           int[] denom = {2, 0, 4, 8, 0};
    
           for (int i = 0; i < numeros.length; i++){
            try {
                System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
                
            } catch (Exception e) {
                System.out.println(e.getMessage());

                e.printStackTrace(); // vai mostrar de forma mais detalhada onde e qual o erro ocorrido
            } 
            
           }
        }
}
