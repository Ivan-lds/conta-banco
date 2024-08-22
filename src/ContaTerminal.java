import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Para utilizar o Scanner no codigo é necessário importá-lo e inicializa-lo antes.

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = input.nextLine();

        System.out.print("\nQual a sua agência ? ");
        int agência = input.nextInt();

        input.nextLine(); //Se deixar só o nextInt() ele não passa para a proxima pergunta (linha).

        System.out.print("\nNúmero da conta: ");
        String numeroConta = input.nextLine();

        System.out.print("\nInforme o saldo: ");
        double saldo = input.nextDouble();

        System.out.println("\nOlá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agência + ", conta " + numeroConta + " e seu saldo" + saldo + " já está disponível.");

        System.out.println("Escolha: ");
        System.out.println("\n[1] Solicitar saque.");
        System.out.println("[2] Fazer deposito.");
        System.out.println("[3] Consultar saldo.");
        System.out.println("[4] Consultar informações da conta.");
        System.out.println("[5] Encerrar.");
        System.out.print("\nDigite a opção desejada: ");
        int escolha = input.nextInt();

        input.nextLine();

        switch (escolha) {
            case 1:
                System.out.print("\nInforme o valor: ");
                int valorSaque = input.nextInt(); 

                input.nextLine();

                System.out.println("\nSaque realizado com sucesso!");
                break;

            case 2:
                System.out.print("\nInforme o valor que será depositado: ");
                int valorDeposito = input.nextInt();

                input.nextLine();

                System.out.println("\nInsira o dinheiro no local indicado.");

                System.out.println("\nDeposito realizado com sucesso!");
                break;

            case 3:
                System.out.println("\nSeu saldo é de " + saldo);
                break;

            case 4:
                System.out.println("\nSuas informações:");
                System.out.println("\nNome: " + nomeCompleto);
                System.out.println("Agência: " + agência);
                System.out.println("Conta: " + numeroConta);
                break;

            case 5:
                break;
        
            default:
            System.out.println("\nOpção Inválida!");
                break;
        }
    }
    
}