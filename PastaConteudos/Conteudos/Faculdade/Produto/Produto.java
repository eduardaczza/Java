package PastaConteudos.Conteudos.Faculdade.Produto;

public class Produto {
    
    private String nomeP;
    private double preco;
    private int estoque;

    public Produto(String nomeP, double preco, int estoque){
        this.nomeP = nomeP;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void vender(int qantdd){
        if (qantdd > 0 && qantdd <= estoque) {
            estoque -= qantdd;
            System.out.println("Foram vendidos " + qantdd + " unidades de " + nomeP);
        } else {
            System.out.println("O estoque do produto solicitado está vazio.");
        }
    }

    public void reabastecer(int qntidade){
        if (qntidade > 0) {
            estoque += qntidade;
            System.out.println("Foram adicionados " + qntidade + " unidades de " + nomeP);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void exibirInfo(){
        System.out.println("Produto: " + nomeP);
        System.out.println("Preço do produto: R$ " + preco);
        System.out.println("Estoque do produto: " + estoque);
    }
}
