import exercicio.CalcularImposto;
import exercicio.NotaFiscalProduto;
import exercicio.NotaFiscalServico;

public class Main {
    public static void main(String[] args) {
        NotaFiscalServico nfServico = new NotaFiscalServico();
        nfServico.setNumero("111111");
        nfServico.setEmitende("Prefeitura Criciuma");
        nfServico.setValor(500.00);
        nfServico.setDescricaoServico("Manutenção de Computadores");
        System.out.println("Nota Fiscal Serviço: ");
        nfServico.exibirDetalhes();
        System.out.println();

        NotaFiscalProduto nfProduto = new NotaFiscalProduto();
        nfProduto.setNumero("222222");
        nfProduto.setEmitende("Empresa");
        nfProduto.setValor(1000.0);
        nfProduto.setDescricaoProduto("Computador");
        System.out.println("Nota fiscal do produto: ");
        nfProduto.exibirDetalhes();
        System.out.println();

        CalcularImposto calcula = new CalcularImposto();
        double impostoPadrao = calcula.calculaImposto(500.00);
        double impostoComAliquota = calcula.calculaImposto(500.00, 0.15);
        double impostoComAliquotaFixa = calcula.calculaImposto(500.00, 0.15, 50.0);

        System.out.println("Calculo do Imposto: ");
        System.out.println("Imposto padrão (10%): " + impostoPadrao);
        System.out.println("Imposto com alíquota (15%): " + impostoComAliquota);
        System.out.println("Imposto padrão (15%) + taxa fixa (R$50): " + impostoComAliquotaFixa);


    }
}