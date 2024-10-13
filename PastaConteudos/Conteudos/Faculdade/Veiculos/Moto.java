package PastaConteudos.Conteudos.Faculdade.Veiculos;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada){
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void obterInfo(){
        super.obterInfo();
        System.out.println("Cilindros: " + cilindrada);
    }

}
