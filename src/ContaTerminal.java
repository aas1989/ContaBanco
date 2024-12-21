import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner conta = new Scanner(System.in);

        int numero;
        String Agencia;
        String NomeCliente;
        float Saldo;

        System.out.println("Por favor digite o número da sua conta");
        numero = conta.nextInt();
    
        System.out.println("Por favor digite o número da agência");
        Agencia = conta.next();

        conta.nextLine();
        
        System.out.println("Por favor digite seu nome");
        NomeCliente = conta.nextLine();
       
        System.out.println("Digite o valor do seu depósito");
        String entradaSaldo = conta.next();
        entradaSaldo = entradaSaldo.replace(",",".");

        try {
            Saldo = Float.parseFloat(entradaSaldo);
        } catch (NumberFormatException e) {
            Saldo = 0.00f;
        }
        
        System.out.println("Olá, " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " conta "  + numero + " e seu saldo R$" + Saldo + " já está disponivel para saque!");
    }
}
