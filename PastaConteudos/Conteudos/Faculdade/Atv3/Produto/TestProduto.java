package PastaConteudos.Conteudos.Atv3.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Chocolate", 9.99, 30);

        produto.setPreco(55);

        produto.setNome("Cacau");
        System.out.println();

        produto.setQuantidade(35);

        produto.obterInfo();
    }
}
