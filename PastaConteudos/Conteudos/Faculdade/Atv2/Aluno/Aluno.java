package PastaConteudos.Conteudos.Atv2.Aluno;

public class Aluno {
    public String nome;
    private int idade;
    protected String matricula;

    public Aluno(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void obterInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }

    public void valorIdade(){
        if (idade > 0) {
            System.out.println("Idade válida.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
