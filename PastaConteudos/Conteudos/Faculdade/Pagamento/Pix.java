package PastaConteudos.Conteudos.Faculdade.Pagamento;

public class Pix extends Pagamento {

    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento realizado via pix.");
    }

}
