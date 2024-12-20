package exercicio;

public class Banco implements Transacao {
    private int saldo;
    private boolean status;


    public Banco() {
        this.saldo = 100;
        this.status = true;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void somar() {

    }

    @Override
    public void diminuir() {

    }

    @Override
    public void calcImposto() {

    }
}
