package PastaConteudos.Conteudos.Atv.SobrecargaConstrutor2;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;

    public Filme(String titulo, String diretor, int duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public Filme(String titulo){
        this(titulo, "Diretor desconhecido", 120);
    }

    public void obterInfo(){
        System.out.println("Nome do filme: " + titulo);
        System.out.println("Dirigido por: " + diretor);
        System.out.println("Duração: " + duracao + " minutos");
    }
}
