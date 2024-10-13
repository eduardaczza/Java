package PastaConteudos.Conteudos.Faculdade.Pagamento;

public class Debito extends Pagamento {
    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento realizado com cartão de débito");
    }
    

}
