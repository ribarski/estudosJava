package exercicio;

public class CalcularImposto {
    public double calculaImposto(double valor){
        return valor * 0.10;
    }

    public double calculaImposto(double valor, double aliquota) {
        return valor * (aliquota);
    }

    public double calculaImposto(double valor, double aliquota, double taxaFixa) {
        return valor * aliquota + taxaFixa;
    }
}
