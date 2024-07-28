import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}