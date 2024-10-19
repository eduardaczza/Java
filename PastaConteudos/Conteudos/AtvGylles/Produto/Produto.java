package PastaConteudos.Conteudos.AtvGylles.Produto;

public class Produto {
    public String nome;
    private double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void venderProduto(int unidades){
        if (unidades < quantidade) {
            System.out.println("O estoque está vazio.");
        } else {
            quantidade -= unidades;
            System.out.println("Foram vendidos " + unidades + " unidades de " + nome);
        }
    }

    public void obterInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}

