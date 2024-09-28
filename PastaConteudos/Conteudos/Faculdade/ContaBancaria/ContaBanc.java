package PastaConteudos.Conteudos.Faculdade.ContaBancaria;

public class ContaBanc {
    
    private String nome;
    private double saldo;

    public ContaBanc(String nome, double saldoI){
        this.nome = nome;
        this.saldo = saldoI;
    }

    public void deposito(double valor){
        if (saldo > 0) {
            saldo += valor;
            System.out.println("Deposito realizado, seu saldo agora é de " + saldo + " R$");
        } else {
            System.out.println("Não foi possível realizar o deposito solicitado.");
        }
    }

    public void sacar(double valorSacar){
        if (valorSacar > 0 && valorSacar <= saldo) {
            saldo -= valorSacar;
            System.out.println("Seu saque foi realizado com sucesso. Seu saldo agora é de " + saldo + " R$");
        } else {
            System.out.println("Valor inválido, seu saldo é insuficiente.");
        } 
    }

    public void exibirSaldo(){
        System.out.println("O saldo da conta de " + nome + " é de " + saldo + " R$");
    }

}
