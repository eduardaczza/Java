package PastaConteudos.Conteudos.Atv.EncadeadaConstrutores;

public class TestProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Chocolate", 15.99, 30);
        Produto produto2 = new Produto("Bolacha", 3.99);

        produto1.obterInfo();
        System.out.println();

        produto2.obterInfo();
    }

}
