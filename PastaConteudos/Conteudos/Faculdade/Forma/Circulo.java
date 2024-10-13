package PastaConteudos.Conteudos.Faculdade.Forma;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override 
    public double cacularArea(){
        return Math.PI * raio * raio;
    }

}
