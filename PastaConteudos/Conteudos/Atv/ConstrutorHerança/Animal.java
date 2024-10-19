package PastaConteudos.Conteudos.Atv.ConstrutorHerança;

public class Animal {
    private String nome;
    private double peso;

    public Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void obterInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
    }

}
