public class Empresa extends Pessoa {
    private int qtdColaboradores;

    public Empresa(String nome, double vlrMensalidade, double percentualDesconto, int qtdColaboradores) {
        super(nome, vlrMensalidade, percentualDesconto);
        this.qtdColaboradores = qtdColaboradores;
    }

    // POLIMORFISMO: implementação específica do método calcularDesconto para Empresa.
    // Calcula o desconto considerando o número de colaboradores.
    // Isso permite que a chamada de calcularDesconto seja dinâmica conforme o tipo real do objeto.
    @Override
    public double calcularDesconto() {
        return vlrMensalidade * (percentualDesconto * qtdColaboradores);
    }

    // POLIMORFISMO: sobrescrita do método entrarPessoa para adicionar informação específica da Empresa.
    @Override
    public String entrarPessoa() {
        return super.entrarPessoa() + "\nQuantidade de colaboradores: " + qtdColaboradores;
    }
}
