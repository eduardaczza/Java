package PastaConteudos.Conteudos.Faculdade.Produto;

public class TestProd {
    public static void main(String[] args) {
        
        Produto produto = new Produto("Chocolate", 29.90, 50);

        produto.exibirInfo();
        
        produto.vender(15);
        produto.reabastecer(30);

        produto.exibirInfo();

    }
}
