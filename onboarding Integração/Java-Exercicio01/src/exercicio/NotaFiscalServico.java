package exercicio;

public class NotaFiscalServico extends NotaFiscal {
    private String descricaoServico;

    public String getDescricaoServico(){
        return descricaoServico;
    }
    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Descrição do Serviço: " + descricaoServico);
    }
}
