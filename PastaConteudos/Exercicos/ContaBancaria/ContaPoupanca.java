
import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
        //herança e polimorfismo

    private int diaRendimento;

    public int getDiaRendimento(){
        return diaRendimento = diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento){
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString(){
        String s = "ContaPoupanca [";
        s += " diaRendimento" + diaRendimento;
        s += s;
        s += "]";
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance(); // vai obter a data de hoje 

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            //saldo += saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo()) * taxaRendimento);
            return true;            
        } return false;
    }


}
