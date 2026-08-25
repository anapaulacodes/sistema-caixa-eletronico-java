import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000;
        int opcao;

        do {
            System.out.println("\n====== CAIXA ELETRÔNICO ======\n");
            System.out.println("1 - Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("\nEscolha uma opção\n");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é de  R$ " + saldo + " reais");
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("\nERRO: Valor inválido!\n");
                    } else {
                        saldo += deposito;
                        System.out.println("Depósito de R$ " + deposito + " reais foi realizado com sucesso");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double saque = scanner.nextDouble();

                    if (saque <= 0 || saque > saldo) {
                        System.out.println("\nERRO: Saldo insuficiente!\n");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque de R$ " + saque + " reais foi realizado com sucesso");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar o caixa eletrônico!");
                    break;
                default:
                    System.out.println("\nOpção inválida\n");
            }
        } while (opcao != 4);

        scanner.close();

    }
}