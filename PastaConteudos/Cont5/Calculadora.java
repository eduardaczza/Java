package PastaConteudos.Cont5;

public class Calculadora {
    
    //sobrecarga de metodos e construtores(overload)
    
    public int soma(int num1, int num2){
        return num1 + num2;
    }

    public double soma(double num1_, double num2){
        return num1_ + num2;
    }

    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int soma(int[] vetorInteiros){

        int total = 0;

        for(int i = 0; i<vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }
        return total;
    }
}
