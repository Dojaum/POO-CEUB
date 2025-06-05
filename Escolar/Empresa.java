public class Empresa extends Pessoa {
    private int qtdColaboradores;

    public Empresa(String nome, double vlrMensalidade, double percentualDesconto, int qtdColaboradores) {
        super(nome, vlrMensalidade, percentualDesconto);
        this.qtdColaboradores = qtdColaboradores;
    }

    @Override
    public double calcularDesconto() {
        return vlrMensalidade * (percentualDesconto * qtdColaboradores);
    }

    @Override
    public String entrarPessoa() {
        return super.entrarPessoa() + "\nQuantidade de colaboradores: " + qtdColaboradores;
    }
}
