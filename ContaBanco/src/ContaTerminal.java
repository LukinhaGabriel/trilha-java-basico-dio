import java.util.Locale;
import java.util.Scanner;

class ContaTerminal{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Por favor, digite o número da conta: ");
            int numero = scanner.nextInt();
            
            System.out.print("Por favor, digite o número da agência: ");
            String agencia = scanner.next();
                
            System.out.print("Por favor, digite seu nome: ");
            String nomeCliente = scanner.next();
    
            System.out.print("Deposite seu site: ");
            double saldo = scanner.nextDouble();
                
            System.out.print("Olá " + nomeCliente + 
            " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
        } catch (Exception e) {
            System.out.print("Entrada inválida!");
        }
    }
}