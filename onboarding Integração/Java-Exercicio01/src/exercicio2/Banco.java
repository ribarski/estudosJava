package exercicio2;

public class Banco implements Transacao, ContaCorrente {
    private double saldo;
    public boolean status;

    public Banco() {
        this.saldo = 1000.0;
        this.status = true;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    @Override
    public void transferir(double valor, Banco destino) {
      if (status && saldo >= valor) {
          this.saldo -= valor;
          destino.somar(valor);
          System.out.println();
      }

    }

    @Override
    public void pagarTaxaManutencao() {
        double taxa = 20.0;
        if (status && saldo >= taxa) {
            this.saldo -= taxa;
            System.out.println("Taxa paga! Novo saldo: R$" + saldo);
        }

    }

    public void status(){
        return;
    }

    @Override
    public void somar(double valor) {
        if (status) {
            this.saldo += valor;
        }
    }

    @Override
    public void diminuir(double valor) {
        if (status && saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Novo saldo: R$ ");
        }
    }
    @Override
    public void calcImposto() {
        double imposto = saldo * 0.05;
        System.out.println("Imposto cobrado de 5%, saldo R$: ");
    }
}
