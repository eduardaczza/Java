package PastaConteudos.Conteudos.Faculdade.Veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;


    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(){
       System.out.println("O veículo está acelerando.");
    }

   public void frear(){
      System.out.println("O veículo está freando.");
    }

    public void obterInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public class TestVeiculo{
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2019, 4);

        Moto moto = new Moto("Honda", "NX500", 2024, 2);

        Caminhao caminhao = new Caminhao("Volvo", "Volvo FH ", 2023, 38);

        carro.obterInfo();
        System.out.println();

        moto.obterInfo();
        System.out.println();

        caminhao.obterInfo();
        
        }
    }
}
