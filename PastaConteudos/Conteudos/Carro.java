package PastaConteudos.Conteudos;

class Carro { 
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombst;

    //método simples sem retorno
    void exibirAutonomia() { // declaração de um método, deve começar com um verbo de preferência de acordo
                             // com as boas praticas
        System.out.println("A autonomia do carro é: " + capCombustivel * consCombst + " Km");
    }

    // outro método agora com retorno
    double obterAutonomia() { // se não colocar o return o java vai exigir que mude o método para void

        System.out.println("Métodos obterAutonomia foi chamado.");

        return capCombustivel * consCombst;
    }

    //adição de outro método
    double calcularCombus(double Km){
        
        double qtdCombs = Km/consCombst;

        return qtdCombs;
    }

}