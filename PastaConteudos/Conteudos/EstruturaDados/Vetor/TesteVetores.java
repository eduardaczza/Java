package PastaConteudos.Conteudos.EstruturaDados.Vetor;

public class TesteVetores {
    public static void main(String[] args) {
    
        Vetores vetor = new Vetores(5);

       try {
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

       } catch (Exception e) {
        e.printStackTrace();
       }

}
}
