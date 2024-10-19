package PastaConteudos.Conteudos.AtvGylles.Livro;

public class Livro {
    public String titulo;
    private String autor;
    protected int paginas;

    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void obterInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
    }
}
