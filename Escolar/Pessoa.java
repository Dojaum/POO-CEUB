public class Pessoa {
    protected String nome;
    protected double vlrMensalidade;
    protected double percentualDesconto;

    public Pessoa(String nome, double vlrMensalidade, double percentualDesconto) {
        this.nome = nome;
        this.vlrMensalidade = vlrMensalidade;
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularDesconto() {
        return 0;
    }

    public String entrarPessoa() {
        return "Nome: " + nome + "\nMensalidade: " + vlrMensalidade + "\nDesconto: " + percentualDesconto;
    }
}
