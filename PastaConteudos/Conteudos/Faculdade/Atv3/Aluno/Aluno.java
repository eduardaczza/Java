package PastaConteudos.Conteudos.Atv3.Aluno;

public class Aluno {

    private String nome;
    private String matricula;
    private int idade;

    public Aluno(String nome, String matricula, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;    
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
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
