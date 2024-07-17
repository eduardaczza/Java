package PastaConteudos.Conteudos.Recursividade;

public class Fatorial {
    
    //metodos recursivos(muito usado em estrutura de dados)

    //5! -> 5*4*3*2*1 = 120
    //fatorial não recursivo
    public static int fatorialNRecursivo(int num){
        if (num==0) {
            return 1;
        }
        int total = 1;
        for (int i = num; i<1; i--){
            total *= i;
        }
        return total;
    }

    //recursivo
    public static int fatorial(int num){

        if (num==0) {
            return 1;
        }

        return num * fatorial(num-1);
    }
}
