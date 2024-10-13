package PastaConteudos.Conteudos.AtvGylles.SobrecargaConstrutor2;

public class TestFilme {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Jogos Vorazes", "Francis Lawrence", 140);
        Filme filme2 = new Filme("Your name");

        filme1.obterInfo();
        System.out.println();
        
        filme2.obterInfo();
    }
}
