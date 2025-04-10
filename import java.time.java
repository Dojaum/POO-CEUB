import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Classe Vendedor
class Vendedor {
    private String nome;
    private String matricula;

    public Vendedor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}

// Classe Cliente
class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}

// Classe ItemPedido
class ItemPedido {
    private String codigo;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String codigo, String descricao, int quantidade, double precoUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularTotal() {
        return quantidade * precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}

// Classe Pedido
class Pedido {
    private static int contador = 1;
    private int id;
    private LocalDateTime dataHora;
    private Vendedor vendedor;
    private Cliente cliente;
    private String status;
    private List<ItemPedido> itens;
    private double desconto;

    public Pedido(Vendedor vendedor, Cliente cliente) {
        this.id = contador++;
        this.dataHora = LocalDateTime.now();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.status = "processando";
        this.itens = new ArrayList<>();
        this.desconto = 0.0;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(String codigoItem) {
        itens.removeIf(item -> item.getCodigo().equals(codigoItem));
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularTotal();
        }
        return total - desconto;
    }

    public void aplicarDesconto(double valor) {
        this.desconto = valor;
    }

    public void atualizarStatus(String novoStatus) {
        if (novoStatus.equals("processando") || novoStatus.equals("enviado") || 
            novoStatus.equals("entregue") || novoStatus.equals("cancelado")) {
            this.status = novoStatus;
        } else {
            System.out.println("Status inválido.");
        }
    }

    public void exibirResumo() {
        System.out.println("Pedido #" + id);
        System.out.println("Data: " + dataHora);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Status: " + status);
        System.out.println("Itens:");
        for (ItemPedido item : itens) {
            System.out.printf("- %s (x%d): R$ %.2f%n", item.getDescricao(), item.getQuantidade(), item.calcularTotal());
        }
        System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
        System.out.println("--------------------------------------------------");
    }
}
