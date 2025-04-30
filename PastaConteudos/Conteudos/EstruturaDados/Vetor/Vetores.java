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
        
    // 
    
    public boolean adiciona (String elemento){
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public String busca (int posicao){ //vai mostrar determinado elemento de uma posição
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca (String elemento){ //verificar se o elemento existe
        for (int i = 0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho(){
        return this.tamanho;
    }

    //esse pedaço vai fazer os nulls não aparecerem na hora de debugar
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(); 
        s.append("["); // append usado para deixar o codigo mais organizado se não iriamos ter que usar s =+...

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }


}
