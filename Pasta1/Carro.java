package Pasta1;

class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombst;

    void exibirAutonomia() { // declaração de um metodo, deve começar com um verbo de preferência de acordo
                             // com as boas praticas
        System.out.println("A autonomia do carro é: " + capCombustivel * consCombst + " Km");
    }

}