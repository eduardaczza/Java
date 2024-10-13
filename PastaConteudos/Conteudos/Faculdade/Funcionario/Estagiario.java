package PastaConteudos.Conteudos.Faculdade.Funcionario;

public class Estagiario extends Funcionario {
    private double desconto;

    public Estagiario(String nome, double salario, double desconto){
        super(nome, salario);
        this.desconto = desconto;
    }

    @Override
    public void obterInfo(){
        super.obterInfo();
        System.out.println("Desconto: R$ " + desconto);
    }
}
