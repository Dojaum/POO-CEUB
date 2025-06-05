// Classe abstrata Pessoa - não pode ser instanciada diretamente
public abstract class Pessoa {
    protected String nome;
    protected double vlrMensalidade;
    protected double percentualDesconto;

    public Pessoa(String nome, double vlrMensalidade, double percentualDesconto) {
        this.nome = nome;
        this.vlrMensalidade = vlrMensalidade;
        this.percentualDesconto = percentualDesconto;
    }

    // Método abstrato que obriga subclasses a implementarem seu próprio cálculo de desconto.
    // POLIMORFISMO: garante que cada subclasse defina como calcular o desconto corretamente.
    public abstract double calcularDesconto();

    public String entrarPessoa() {
        return "Nome: " + nome + "\nMensalidade: " + vlrMensalidade + "\nDesconto: " + percentualDesconto;
    }
}
