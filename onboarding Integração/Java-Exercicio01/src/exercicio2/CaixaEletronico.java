package exercicio2;

public class CaixaEletronico {
    public static void main(String[] args) {
        Banco conta1 = new Banco();
        Banco conta2 = new Banco();

        System.out.println("Saldo conta1: R$" + conta1.getSaldo());
        System.out.println("Saldo conta2: R$" + conta2.getSaldo());

        conta1.transferir(300, conta2);

        System.out.println("Saldo conta1: R$" + conta1.getSaldo());
        System.out.println("Saldo conta2: R$" + conta2.getSaldo());

        conta1.status();
        System.out.println(conta1.status);

    }
}
