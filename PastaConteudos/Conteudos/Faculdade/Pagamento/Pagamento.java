package PastaConteudos.Conteudos.Faculdade.Pagamento;

abstract class Pagamento {
    public abstract void realizarPagamento();

    public class TestPagamento{
        public static void main(String[] args) {
            Pagamento[] pagamentos = new Pagamento[3];
            pagamentos[0] = new Credito();
            pagamentos[1] = new Debito();
            pagamentos[2] = new Pix();

            for (Pagamento pagamento : pagamentos) {
                pagamento.realizarPagamento();
            }
        }
    }
    
}
