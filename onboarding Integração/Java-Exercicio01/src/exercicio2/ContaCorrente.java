package exercicio2;

public interface ContaCorrente {
    public abstract void transferir (double valor, Banco destino);
    public abstract void pagarTaxaManutencao();
}
