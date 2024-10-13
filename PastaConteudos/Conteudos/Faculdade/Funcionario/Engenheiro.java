package PastaConteudos.Conteudos.Faculdade.Funcionario;

public class Engenheiro extends Funcionario {
    private String atuacao;

    public Engenheiro(String nome, double salario, String atuacao){
        super(nome, salario);
        this.atuacao = atuacao;
    }

    @Override
    public void obterInfo(){
        super.obterInfo();
        System.out.println("Área de atuação: " + atuacao);
    }


}
