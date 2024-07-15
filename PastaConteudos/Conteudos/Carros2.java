package PastaConteudos.Conteudos;

public class Carros2 {

    //usando construtores

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombst;


   Carros2(){
        System.out.println("Classe Carros2 foi instanciada.");
        numPassageiros = 4;
    }


    //sem o this
    Carros2(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consCombst_){
        //construtores com parametros
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consCombst = consCombst_;
    }

    
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consCombst + " Km");
    }

    double obterAutonomia() { 

        System.out.println("Métodos obterAutonomia foi chamado.");

        return capCombustivel * consCombst;
    }

    double calcularCombus(double Km){
        
        double qtdCombs = Km/consCombst;

        return qtdCombs;
    }
}
