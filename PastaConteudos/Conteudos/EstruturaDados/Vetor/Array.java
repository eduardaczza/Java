package PastaConteudos.Conteudos.EstruturaDados.Vetor;

public class Array {
    //apenas para lembrar
    public static void main(String[] args) {
        double[] temperaturas = new double[365];

        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 35.3;
        temperaturas[3] = 29.3;
        temperaturas[4] = 17.3;
        
        System.out.println("O valor da temperatura do dia 3 é " + temperaturas[2]);

        System.out.println("O tamanho do array " + temperaturas.length);

        for (int i = 1; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + "é " + temperaturas[i]);
        }

        for (double temp : temperaturas) {
            System.out.println(temp);
        }
    }
}
