package PastaConteudos.Conteudos.Carros3;

public class C2 {
    
    //construtores usando o this
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombst;

    //com o this
    public C2(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombst){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consCombst = consCombst;
    }

    public C2(){ }

    public C2(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parametros.");
    }

    public C2(String marca, String modelo){
        this(marca, modelo, 10);
        System.out.println("Chamando dois parametros.");
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consCombst + " Km");
    }

    double obterAutonomia() { 

        System.out.println("Métodos obterAutonomia foi chamado.");

        return this.capCombustivel * this.consCombst;
    }

    double calcularCombus(double Km){
        
        double qtdCombs = Km/this.consCombst;

        return qtdCombs;
    }
    
}
