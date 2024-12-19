package exercicio;

public class NotaFiscalProduto extends  NotaFiscal {
    private String descricaoProduto;

    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Descrição do Produto: " + descricaoProduto);
    }
}
