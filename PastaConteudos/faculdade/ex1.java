import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // milhas para km
        System.out.println("Digite a distância em milhas para converter para km: ");
        double milhas = scanner.nextDouble();

        double km = milhas * 1.60934;

        System.out.println("A distância de " + milhas + " milhas para km é igual a " + km + " km");

        // salario com reajuste 15%
        System.out.println("Digite o salario: ");
        double salario = scanner.nextDouble();

        double novoS = salario * 1.15;

        System.out.println("O salario no valor de " + salario + " teve um reajuste de 15% e passou a ser " + novoS);

        // deposito e rendimento na poupança de 5%
        System.out.println("Digite o valor a ser depositado: ");
        double deposito = scanner.nextDouble();

        double rendimento = 0.05;

        double rendDep = deposito + (deposito * rendimento);

        System.out.println("Após um mês de aplicação o rendimento foi de " + rendDep);

        // quociente e resto de uma divisao por 3
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int quociente = num / 3;

        int resto = num % 3;

        System.out.println("O quociente do número " + num + " por 3 é igual a " + quociente);

        System.out.println("O resto da divisão do número " + num + " por 3 é igual a " + resto);

        // alimentos em kg
        System.out.println("Digite quantos kg tem o alimento: ");
        double qantidKg = scanner.nextDouble();

        double qtddG = qantidKg * 1000;

        double consumoDiario = 50;

        double diasD = qtddG / consumoDiario;

        System.out.println("O alimento vai durar " + diasD + " dias.");

        
        scanner.close();
    }

}
