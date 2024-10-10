import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);  
        

        System.out.println("Olá, seja bem ao banco <<JavaBank>>");
        System.out.println("-----------------------------------");
        System.out.println("Vamos começar a criar sua conta.");
        System.out.println(" ");

        System.out.println("Por favor, Digite seu nome: ");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, Deposite um valor em sua conta: ");
        double saldo = scanner.nextDouble();
        
        // impressão
        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + numeroConta + ", e seu saldo: R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
