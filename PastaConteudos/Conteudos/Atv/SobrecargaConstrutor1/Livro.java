package PastaConteudos.Conteudos.AtvGylles.SobrecargaConstrutor1;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Livro(String titulo){
        this.titulo = titulo;
        this.autor = "Não informado";
        this.paginas = 0;
    }

    public void obterInfo(){
        System.out.println("Título da obra: " + titulo);
        System.out.println("Nome do autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
    }
}
