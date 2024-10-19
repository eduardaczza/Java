package PastaConteudos.Conteudos.Atv2.Aluno;

public class TestAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Caio", 19, "1234556");
        Aluno aluno2 = new Aluno("Eduarda", 18, "246810");

        aluno1.obterInfo();
        System.out.println();
        
        aluno2.obterInfo();
        System.out.println();

        //aluno1.idade = 10;

        //aluno2.valorIdade();
        
        aluno1.nome = "Luiza";
        aluno1.matricula = "120306";
        aluno1.obterInfo();
        
    }
}
