public class Aluno extends Pessoa {

    public Aluno(String nome, double vlrMensalidade, double percentualDesconto) {
        super(nome, vlrMensalidade, percentualDesconto);
    }

    // POLIMORFISMO: implementação específica do método calcularDesconto para Aluno.
    // Permite que ao chamar calcularDesconto em Pessoa, o cálculo correto para Aluno seja executado.
    @Override
    public double calcularDesconto() {
        return vlrMensalidade * percentualDesconto;
    }
}
