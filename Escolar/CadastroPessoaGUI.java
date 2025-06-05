import javax.swing.*;

public class CadastroPessoaGUI {
    public static void main(String[] args) {
        String[] opcoes = {"Aluno", "Empresa"};

        int escolha = JOptionPane.showOptionDialog(
                null,
                "Selecione o tipo de pessoa:",
                "Cadastro de Pessoa",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        if (escolha == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
            return;
        }

        String nome = JOptionPane.showInputDialog("Digite o nome:");
        if (nome == null) return;

        double mensalidade = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor da mensalidade:")
        );

        double percentual = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o percentual de desconto (ex.: 0.10 para 10%):")
        );

        if (escolha == 0) { // Aluno
            Pessoa pessoa = new Aluno(nome, mensalidade, percentual);

            // POLIMORFISMO: mesmo que a variável seja do tipo Pessoa,
            // o método calcularDesconto da classe Aluno será executado
            double desconto = pessoa.calcularDesconto();

            JOptionPane.showMessageDialog(
                    null,
                    pessoa.entrarPessoa() + "\nDesconto calculado: R$ " + String.format("%.2f", desconto)
            );

        } else { // Empresa
            int colaboradores = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a quantidade de colaboradores:")
            );

            Pessoa pessoa = new Empresa(nome, mensalidade, percentual, colaboradores);

            // POLIMORFISMO: método calcularDesconto da classe Empresa será executado,
            // conforme o tipo real do objeto Pessoa que aponta para Empresa.
            double desconto = pessoa.calcularDesconto();

            JOptionPane.showMessageDialog(
                    null,
                    pessoa.entrarPessoa() + "\nDesconto calculado: R$ " + String.format("%.2f", desconto)
            );
        }
    }
}
