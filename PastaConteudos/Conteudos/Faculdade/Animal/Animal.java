package PastaConteudos.Conteudos.Faculdade.Animal;

public class Animal {
    private String nome;
    
    public Animal(String nome, int idade){
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println("Som do animal");
    }

 public class TestAnimal{
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro("Toy", 5);
        animais[1] = new Gato("Nina", 11);
        animais[2] = new Papagaio("Egg", 2);

        for (Animal animal : animais) {
            System.out.print(animal.nome + " faz: ");
            animal.fazerSom();
        }
    }
 }   
}
