package exercicio;

public class NotaFiscal {
    private String numero;
    private String emitente;
    protected double valor;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmitende() {
        return emitente;
    }

    public void setEmitende(String emitende) {
        this.emitente = emitende;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            throw new RuntimeException("Valor não pode ser negativo");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nota Fiscal "+ numero + ", Emitente: " + emitente + ", Valor: R$ "+ valor);
    }
}
