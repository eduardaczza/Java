package PastaConteudos.Exercicos.Recursividade;

public class TestFib {
    
    public static void main(String[] args) {
        for(int i = 1; i<10; i++){
            System.out.println(Fibonacci.fibonacci(i) + " ");
        }
        System.out.println(Fibonacci.fibonacci(3));
    }
}
