import java.util.Scanner;

public class ContaTerminal {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }

}
