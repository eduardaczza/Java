package PastaConteudos.Conteudos.Faculdade.Forma;

abstract class Forma {
    public abstract double cacularArea();

    public class TestForma{
        public static void main(String[] args) {
            Forma[] formas = new Forma[3];
            formas[0] = new Circulo(10);
            formas[1] = new Quadrado(4);
            formas[2] = new Retangulo(4, 6);

            for(Forma forma : formas){
                System.out.println("A área da forma é " + forma.cacularArea());
            }
        }
    }

}
