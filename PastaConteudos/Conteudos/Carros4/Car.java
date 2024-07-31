package PastaConteudos.Conteudos.Carros4;

public class Car {
    
    private String marca;
    private String modelo;
    private int numPassageiros;

    public String getMarca(){ //get realiza uma busca por um dado elemento em uma posição específica da lista
        return this.marca;
    }

    public void setMarca(String marca){ // set realoca ou introduz um novo elemento na lista 
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    public int NumPassageiros(){
        return this.numPassageiros;
    }

}
