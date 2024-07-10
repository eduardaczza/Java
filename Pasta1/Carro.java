package Pasta1;

class Carro { //método simples sem retonro 
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombst;

    void exibirAutonomia() { // declaração de um método, deve começar com um verbo de preferência de acordo
                             // com as boas praticas
        System.out.println("A autonomia do carro é: " + capCombustivel * consCombst + " Km");
    }

    //outro método
    double obterAutonomia() { //se não colocar o return o java vai exigir que mude o método para void

        System.out.println("Métodos obterAutonomia foi chamado.");

        return capCombustivel * consCombst;
    }

}