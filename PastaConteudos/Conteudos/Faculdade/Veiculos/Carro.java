    package PastaConteudos.Conteudos.Faculdade.Veiculos;

    public class Carro extends Veiculo {
        private int numPortas;

        public Carro(String marca, String modelo, int ano, int numPortas){
            super(marca, modelo, ano);
            this.numPortas = numPortas;
        }

        @Override
        public void obterInfo(){
            super.obterInfo();
            System.out.println("Número de portas: " + numPortas);
        }

        @Override
        public void acelerar(){
            System.out.println("O veículo está acelerando");
        }
    }
