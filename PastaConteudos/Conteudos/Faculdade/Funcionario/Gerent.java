package PastaConteudos.Conteudos.Faculdade.Funcionario;

public class Gerent extends Funcionario{
    private double bonificacao;

    public Gerent(String nome, double salario, double bonificacao){
        super(nome, salario);
        this.bonificacao = bonificacao;
    }

    @Override 
    public void obterInfo(){
      super.obterInfo();
      System.out.println("Bonificação: R$ " + bonificacao);
    } 
}
