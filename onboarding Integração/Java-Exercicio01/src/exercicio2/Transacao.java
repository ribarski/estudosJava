package exercicio2;

public interface Transacao {
    public abstract void somar(double valor);
    public abstract void diminuir(double valor);
    public abstract void calcImposto();
}
