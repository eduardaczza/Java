package PastaConteudos.Conteudos.Faculdade.Retangulo;

public class Retangulo {
    
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea(){
        return altura * largura;
    }

    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }

    public void exibirArea(){
        System.out.println("A area do retângulo é igual a " + calcularArea());
    }

    public void exibirPerimentro(){
        System.out.println("O perimetro do retângulo é igual a " + calcularPerimetro());
    }
}
