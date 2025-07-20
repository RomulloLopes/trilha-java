import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Informações da conta
        // Solicitar ao usuário os dados da conta

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        /*System.out.printf("---------- Olá %s!!! ----------------- \nobrigado por criar uma conta em nosso banco, \nsua agência é %s, conta %d  \nseu saldo %.2f já está disponível para saque. \n-------------------------------------------- ", nomeCliente, agencia, numeroConta, saldo);
        */
        
        // Exibir as informações da conta formatadas
        System.out.println();
        System.out.println("---------- Olá " + nomeCliente + "!!! -----------------");
        System.out.println("Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Seu número de conta é: " + numeroConta);
        System.out.printf("Seu saldo é: %.2f\n", saldo);
        System.out.println("--------------------------------------------");

        // Fechar o scanner
        scanner.close();
    }
}