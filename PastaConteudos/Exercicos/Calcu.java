package PastaConteudos.Exercicos;

public class Calcu {
    
    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return num1 / num2;
    }

    //x^n
    public static double potencia(double num1, double num2){
        return Math.pow(num1, num2);
    }

    //5! = 5*4*3*2*1 = 120
    public static int fatorial(int num){
        if (num==0) {
            return 1;
        }
        int total = 1; 
        for(int i = num; i>1; i--){
            total *= i;
        }

        return total;
    }
}
