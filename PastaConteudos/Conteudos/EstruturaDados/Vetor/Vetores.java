package PastaConteudos.Conteudos.EstruturaDados.Vetor;

public class Vetores {

    private String[] elementos; //vetor criado
    private int tamanho;

    public Vetores(int capacidade){   //construtor
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento){
        for (int i = 0; i < this.elementos.length; i++){
            if (this.elementos[i] == null) {  //se a posição estiver nula 
                this.elementos[i] = elemento;
                break;
            }
        }       
    }  */ 
        
    public void adiciona(String elemento)throws Exception{

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já esta cheio, não é possível adicionar mais elemento.");
        }
    }         
}    
    
    
