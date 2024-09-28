package PastaConteudos.Conteudos.Faculdade.Filme;

import java.util.Calendar;

public class Filme {
    
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private double duracao;

    public Filme(String titulo, String diretor, int anoLancamento, double duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao + " horas ");
    }

    public boolean filmeClassico(){
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return anoAtual - anoLancamento > 30;
    }
}
