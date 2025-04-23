public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    @Override
    public String toString(){
        String s = "ContaEspecial [";
        s += "ContaEspecial" + limite;
        s += s;
        s += "]";
        return s;
    }

    public boolean sacar(double valor){
        
        double saldoLimite = this.getSaldo() + limite;

        if ((saldoLimite-valor)>=0) {
            this.setSaldo(this.getSaldo()-valor);
            return false;
        }
        return false;
    }
}
