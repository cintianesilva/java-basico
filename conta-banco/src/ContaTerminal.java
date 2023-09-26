import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner


        float saldo = 584.50F;

        Scanner conta = new Scanner(System.in);
        int numero;
        System.out.println("Digite o número da conta: ");
        numero = conta.nextInt();


        Scanner agencia = new Scanner(System.in);
        String nAgencia;
        System.out.println("Informe a agência: ");
        nAgencia = agencia.nextLine();
        System.out.println("A agência informada foi: " + nAgencia);


        Scanner cliente = new Scanner(System.in);
        String nome;
        System.out.println("Qual o nome do cliente? ");
        nome = cliente.nextLine();




        //Exibir a mensagem conta criada

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + nAgencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
