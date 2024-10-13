package PastaConteudos.Conteudos.Faculdade.Forma;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double cacularArea(){
        return lado * lado;
    }
}
