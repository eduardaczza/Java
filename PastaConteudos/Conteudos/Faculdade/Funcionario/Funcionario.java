package PastaConteudos.Conteudos.Faculdade.Funcionario;

public class Funcionario {
    private String nome;
    private double salario;  

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void obterInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }

    public class TestFunc{
        public static void main(String[] args) {
            Gerent gerente = new Gerent("Caio", 2000, 1000);

             
            Engenheiro engenheiro = new Engenheiro("Eduarda", 3000, "Eng Software");

            Estagiario estagiario = new Estagiario("Luiza", 1000, 186);

            gerente.obterInfo();
            System.out.println();

            engenheiro.obterInfo();
            System.out.println();

            estagiario.obterInfo();
        }
    }
}
