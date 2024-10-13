package PastaConteudos.Conteudos.Faculdade.Instrumentos;

abstract class Instrumento {
    public abstract void tocar();

    public class TestInstrumento{
        public static void main(String[] args) {
            Instrumento[] instrumentos = new Instrumento[3];
            instrumentos[0] = new Violao();
            instrumentos[1] = new Piano();
            instrumentos[2] = new Bateria();

            for(Instrumento instrumento : instrumentos){
                instrumento.tocar();
            }
        }
    }
}
