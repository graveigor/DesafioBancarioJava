public class Desafio {
    public static void main(String[] args) {
        String nome = "Tadeu Alves";
        String tipoConta = "Conta corrente";
        double saldo = 1599.99;
        int opcao = 0;
        System.out.println("-----------------");
        System.out.println("\nNome do cliente : " + nome);
        System.out.println("Tipo conta : " + tipoConta);
        System.out.println("Saldo atual : " + saldo);
        System.out.println("\n-----------------");
        String menu = "** Digite sua opção **" +
                "1 - Consultar saldo" +
                "2 - Realizar Pix" +
                "3 - Receber pix" +
                "4 - Sair";
    }
}
