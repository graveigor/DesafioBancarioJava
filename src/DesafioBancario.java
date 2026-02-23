import java.util.Scanner;

public class DesafioBancario {
    public static void main(String[] args) {
        // Inicialização dos dados do cliente e saldo
        String nome = "Tadeu Alves";
        String tipoConta = "Conta corrente";
        double saldo = 1599.99;
        int opcao = 0;

        // Exibição do resumo inicial da conta
        System.out.println("-----------------");
        System.out.println("\nNome do cliente : " + nome);
        System.out.println("Tipo conta : " + tipoConta);
        System.out.println("Saldo atual : " + saldo);
        System.out.println("\n-----------------");

        // Texto do menu que será exibido repetidamente
        String menu = """
                     ** Digite sua opção **
                    1 - Consultar saldo
                    2 - Realizar Pix
                    3 - Receber pix
                    4 - Sair
                    
                    """;

        Scanner leitura = new Scanner(System.in);

        // Loop que mantém o sistema ativo até o usuário digitar 4
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            // Opção 1: Exibe o saldo atual
            if (opcao == 1) {
                System.out.println("O saldo atualizado é : " + saldo);

            }
            // Opção 2: Lógica de transferência com verificação de saldo
            else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar a tranferência!");
                } else {
                    saldo -= valor; // Subtrai o valor do saldo
                    System.out.println("Novo saldo : " + saldo);
                }
            }
            // Opção 3: Lógica para depósito/recebimento
            else if (opcao == 3) {
                System.out.println("Valor recebido : ");
                double valor = leitura.nextDouble();
                saldo += valor; // Soma o valor ao saldo atual
                System.out.println("Novo saldo : " + saldo);
            }
            // Tratamento de erros para entradas inválidas no menu
            else if (opcao != 4) {
                System.out.println("Opção Inválida! Por favor, digite uma opção válida!");
            }
        }
    }
}