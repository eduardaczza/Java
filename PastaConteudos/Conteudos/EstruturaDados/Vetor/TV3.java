package PastaConteudos.Conteudos.EstruturaDados.Vetor;

public class TV3 {

   public static void main(String[] args) {
    
    Vetores vetor = new Vetores(5);

    vetor.adiciona("elemento 1");
    vetor.adiciona("elemento 2");
    vetor.adiciona("elemento 3");

    System.out.println(vetor.busca(2));
   }
}
