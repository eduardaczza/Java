package PastaConteudos.Exercicos.Lampada;

public class Lampada {
    
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada==true) {  // o true não é necessário ja que lampada já é verdadeira, mas vou deixar apenas por preferência
            System.out.println("Lâmpada está ligada.");
        } else {
            System.out.println("Lâmpada está desligada.");
        }
    }

    void mudarEstado(){
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}
