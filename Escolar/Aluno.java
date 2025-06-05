public class Aluno extends Pessoa {

    public Aluno(String nome, double vlrMensalidade, double percentualDesconto) {
        super(nome, vlrMensalidade, percentualDesconto);
    }

    @Override
    public double calcularDesconto() {
        return vlrMensalidade * percentualDesconto;
    }
}
