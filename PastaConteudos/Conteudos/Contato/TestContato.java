package PastaConteudos.Conteudos.Contato;

public class TestContato {
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        contato.setNome("Tytion");
       // contato.setEndereco("Kings Londing");
        //contato.setTelefone("11 99999-9999");

        //criando o objeto endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("999999");

        contato.setEndereco(end);

        //relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("11");
        telefone2.setNumero("88888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;


        //contato.setTelefone(telefone);
        contato.setTelefone(telefones);

        //Teste no console
        System.out.println(contato.getNome());
        

        if (contato != null && contato.getEndereco()!=null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones()!=null) {
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            } 
              }
    }
}
