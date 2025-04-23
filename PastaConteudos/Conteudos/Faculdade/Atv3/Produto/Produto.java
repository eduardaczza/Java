package PastaConteudos.Conteudos.Atv3.Produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
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
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
    }

}
