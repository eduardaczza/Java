package PastaConteudos.Conteudos.Atv2.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Chocolate", 9.99, 30);

        //System.out.println("Preço: " + produto2.preco);

        produto.venderProduto(10);
        //System.out.println();


        produto.obterInfo();
        System.out.println();

        produto.nome = "Cacau";

        produto.quantidade = 45;

        produto.obterInfo();
        
    }
}
