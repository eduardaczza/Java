package PastaConteudos.Conteudos.Faculdade.Veiculos;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga){
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override 
    public void obterInfo(){
        super.obterInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga);
    }
}
