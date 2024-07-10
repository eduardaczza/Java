package PastaConte.Exercicos;

public class ContaCorrente {
    
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double qtdASacar){
        
        //tem saldo na conta
        if (saldo >= qtdASacar) {
            saldo -= qtdASacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite>=qtdASacar) {
                    saldo -= qtdASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo suficiente

            }
        }
    }

    void depositar(double valorDepositado){

        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual da conta: " + saldo);
    }

    boolean verificarUsoChequeEspcl(){
        return saldo < 0;
    }
}
