import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("digite seu nome:");
        String nomeCliente=scanner.next();
        
        System.out.println("Digite o número da sua agência:");
        int agencia = scanner.nextInt();
        
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        String textoBoasVindas=("Olá " +nomeCliente+  " obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numeroConta+ " e seu saldo " +saldo+ " já está disponível para saque");
        System.out.println(textoBoasVindas);
    }
}
