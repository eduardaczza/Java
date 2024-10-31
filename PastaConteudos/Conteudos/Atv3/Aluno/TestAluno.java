package PastaConteudos.Conteudos.Atv3.Aluno;

public class TestAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Caio", "2547562", 19);

        Aluno aluno2 = new Aluno("Eduarda", "4852448", 18);

        aluno1.obterInfo();
        System.out.println();

        aluno2.obterInfo();

        aluno2.setIdade(19);

        aluno1.valorIdade();

        aluno2.getMatricula();

        aluno1.getNome();
    }
}
