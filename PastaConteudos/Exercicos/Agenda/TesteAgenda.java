package PastaConteudos.Exercicos.Agenda;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome para a Agenda: ");
        String nome = scanner.nextLine();
    
        Agenda agenda = new Agenda(nome);  //metodo mais curto
        //Agenda agenda = new Agenda();  metodo mais completo
        //agenda.setNome(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i< 3; i++){
            System.out.println("Digite as informações do contato" + (i+1));
            Contato c = new Contato(); // armazenar as informações de um contato específico

            System.out.println("Digite o nome do contato ");
            nome = scanner.nextLine();
            c.setNome(nome); //Atribui o nome digitado ao objeto "c" (contato)

            System.out.println("Digite o telefone do contato ");
            String telefone = scanner.nextLine();
            c.setTelefone(telefone); 

            System.out.println("Digite o email do contato ");
            String email = scanner.nextLine();
            c.setEmail(email); 

            contatos[i] = c;
        }
        agenda.setContatos(contatos);

        if (agenda != null) {   //verificação
            System.out.println(agenda.obterInfo());
        }
    scanner.close();
    }
}
