package PastaConteudos.Conteudos.Faculdade.Pessoa;

public class TestPessoa {
   public static void main(String[] args) {
    
    Pessoa pessoa = new Pessoa();

    pessoa.nome = "Caio";
    pessoa.nacionalidade = "Brasileiro";
    pessoa.idade = 18;
    pessoa.aniversario(1);
    pessoa.altura = 1.83;

    System.out.println("Nome: " + pessoa.nome);
    System.out.println("Nacionalidade: " + pessoa.nacionalidade);
    System.out.println("Idade: " + pessoa.idade);
    System.out.println("Altura: " + pessoa.altura);

   }

}
