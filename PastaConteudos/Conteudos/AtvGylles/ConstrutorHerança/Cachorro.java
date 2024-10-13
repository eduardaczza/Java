package PastaConteudos.Conteudos.AtvGylles.ConstrutorHerança;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, double peso, String raca){
        super(nome, peso);
        this.raca = raca;
    }

    @Override
    public void obterInfo(){
        super.obterInfo();
        System.out.println("Raça: " + raca);
    }
}
