package Pessoa;
public class TesteP {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Caio", 2345654, 19);
        pessoa1.mostrarInfo();

        Pessoa pessoa2 = new Pessoa("Eduarda", 0, 0);
        pessoa2.mostrarInfo();

        Pessoa pessoa3 = new Pessoa("", 0, 0);
        pessoa3.mostrarInfo();
      

        pessoa2.setNumeroContribuinte(124356788);
        pessoa2.setIdade(18);
        pessoa2.mostrarInfo();
        
    }
}
