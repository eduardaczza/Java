package Pessoa;
public class Pessoa {
    String nome;
    int numeroContribuinte;
    int idade;

    Pessoa(String nome, int numeroContribuinte, int idade) {

        this.nome = (nome != null ? nome : "");
        this.numeroContribuinte = (numeroContribuinte != 0 ? numeroContribuinte : 0);
        this.idade = (idade != 0 ? idade : 0);

    }

    public String getNome() {
        return nome;
    }

    public int getNumeroContribuinte() {
        return numeroContribuinte;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroContribuinte(int numeroContribuinte) {
        this.numeroContribuinte = numeroContribuinte;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void mostrarInfo() {
        System.out.println("Nome " + nome);

        System.out.println("Número de contribuinte " + numeroContribuinte);

        System.out.println("Idade " + idade);
    }
}
