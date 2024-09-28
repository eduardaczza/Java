package PastaConteudos.Conteudos.Faculdade.ContaBancaria;

public class TestCB {
    public static void main(String[] args) {
      
        ContaBanc conta = new ContaBanc("Luiza", 1500);

        conta.deposito(200);
        conta.sacar(1300);
        conta.exibirSaldo();
    }
}
