package PastaConteudos.Exercicos;

public class TestCalcu {
    
    public static void main(String[] args) {
        
        imprimirTela(Calcu.somar(1, 2));

        imprimirTela(Calcu.subtrair(2, 1));

        imprimirTela(Calcu.multiplicar(2, 2));

        imprimirTela(Calcu.dividir(4, 2));

        imprimirTela(Calcu.potencia(2, 3));
    }

    static void imprimirTela(double num){
        System.out.println(num);
    }
}
