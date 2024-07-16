package PastaConteudos.Conteudos.Carro2;

public class TesteC2 {
    public static void main(String[] args) {
        Carros2 van = new Carros2();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombst = 0.2;

        System.out.println(van.numPassageiros);

        Carros2 van2 = new Carros2("Fiat", "Ducato", 10, 100, 0.2);
        
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustivel);
        System.out.println(van2.consCombst);
    }
}
