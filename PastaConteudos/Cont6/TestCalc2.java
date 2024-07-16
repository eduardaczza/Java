package PastaConteudos.Cont6;

public class TestCalc2 {

    static int resultSoma;

    public static void main(String[] args) {

        // Calculadora2 calc = new Calculadora2();
        // calc.soma(1, 2);

        resultSoma = Calculadora2.soma(1, 2);

        soma2Valores(1, 2);

    }

    static int soma2Valores(int num1, int num2) {
        return Calculadora2.soma(num1, num2);
    }
}
