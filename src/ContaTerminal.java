import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

    int numero;
    int agencia;
    String nome;
    String sobreNome;
    double saldo;
    
    System.out.println("Digite seu nome: ");
    nome = input.nextLine();

    System.out.println("Digite seu sobrenome: ");
    sobreNome = input.nextLine();

    System.out.println("Digite seu numero da conta: ");
    numero = input.nextInt();

    System.out.println("Digite sua agência: ");
    agencia = input.nextInt();

    System.out.println("Digite seu saldo: ");
    saldo = input.nextDouble();
    
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " +  saldo + " já está disponível para saque.");

    input.close();
    }
}
