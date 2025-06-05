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
            Aluno aluno = new Aluno(nome, mensalidade, percentual);
            double desconto = aluno.calcularDesconto();

            JOptionPane.showMessageDialog(
                    null,
                    aluno.entrarPessoa() + "\nDesconto calculado: R$ " + String.format("%.2f", desconto)
            );

        } else { // Empresa
            int colaboradores = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a quantidade de colaboradores:")
            );

            Empresa empresa = new Empresa(nome, mensalidade, percentual, colaboradores);
            double desconto = empresa.calcularDesconto();

            JOptionPane.showMessageDialog(
                    null,
                    empresa.entrarPessoa() + "\nDesconto calculado: R$ " + String.format("%.2f", desconto)
            );
        }
    }
}
