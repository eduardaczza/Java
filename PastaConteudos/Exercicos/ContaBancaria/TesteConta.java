public class TesteConta {
        //herança e polimorfismo

    public static void main(String[] args) {
        
        System.out.println("*** Teste conta bancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        
        contaSimples.setNomeCliente("Cliente conta simples");

        contaSimples.setNumConta("12345");


        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        if (contaSimples.sacar(50)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + contaSimples.getSaldo());
        }else {
            System.out.println("Saldo insuficiente para saque de " + 50 + "; saldo de " + contaSimples.getSaldo());
        }
        

        System.out.println(contaSimples);

        System.out.println("*** Teste contaPoupança ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        
        contaPoupanca.setNomeCliente("Cliente conta poupança");

        contaPoupanca.setNumConta("2222");

        contaPoupanca.setDiaRendimento(14);


        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);

        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Novo rendimento aplicado, novo saldo de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não houve rendimento, novo saldo não pôde ser calculado.");
        }

        System.out.println(contaPoupanca);
        

        System.out.println("*** Teste contaEspecial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        
        contaEspecial.setNomeCliente("Cliente contaEspecial");

        contaEspecial.setNumConta("3332");

        contaEspecial.setLimite(50);


        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);

        System.out.println(contaEspecial);
    }
    

    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo =" + conta.getSaldo());
        }else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de " + conta.getSaldo());
        }
    }
}


