abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;

    // Getters e Setters
}

class Cliente extends Pessoa {
    private String dataCadastro;
    private String status;

    // Getters e Setters
}

class Fornecedor extends Pessoa {
    private String cnpj;
    private String empresaRepresentada;

    // Getters e Setters
}

class Empregado extends Pessoa {
    private String matricula;
    private String cargo;
    private double salario;
    private UsuarioSistema usuarioSistema;

    // Getters e Setters
}

class Vendedor extends Empregado {
    private double comissao;
    private double metaMensal;

    // Getters e Setters
}

class UsuarioSistema {
    private String login;
    private String senha;
    private String nivelAcesso;
    private String ultimoAcesso;

    // Getters e Setters
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de instanciacao de um vendedor
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Carlos Silva");
        vendedor.setCpf("123.456.789-00");
        vendedor.setComissao(0.05);
        vendedor.setMetaMensal(10000.0);

        UsuarioSistema usuario = new UsuarioSistema();
        usuario.setLogin("csilva");
        usuario.setSenha("senha123");
        usuario.setNivelAcesso("Vendedor");
        usuario.setUltimoAcesso("2025-04-29");

        vendedor.setUsuarioSistema(usuario);

        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Login de Acesso: " + vendedor.getUsuarioSistema().getLogin());
    }
}
