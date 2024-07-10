package Conteudo;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombst = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        // chamando o metodo
        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println("A autonomia do carro é: " + van.obterAutonomia());

        double qtdCombs10 = van.calcularCombus(10);
        double qtdCombs15 = van.calcularCombus(15);

        System.out.println("QtdCombs10 = " + qtdCombs10);
        System.out.println("QtdCombs15 = " + qtdCombs15);
    }
}
