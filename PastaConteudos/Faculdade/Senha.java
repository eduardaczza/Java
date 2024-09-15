import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = "2468";
        int tentativas = 1;

        System.out.println("Digite a senha correta: ");
        String digiteSenha = scanner.nextLine();

        while (tentativas < 3) {
            tentativas++;
            System.out.println("Senha incorreta, tente novamente");
            digiteSenha = scanner.nextLine();

            if (digiteSenha.equals(senha)) {
                System.out.println("A senha está correta.");
                System.exit(0);
            }
        }

        if (tentativas == 3) {
            System.out.println("A senha digitada é incorreta.O número de tentativas foi excedido");
            System.exit(1);            
        }
        scanner.close();
    }
}
