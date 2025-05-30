package FolhadePagamento;

/**
 * Classe abstrata que representa um funcionário.
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    /**
     * Construtor da classe Funcionario.
     * @param nome Nome do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe os dados do funcionário.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    /**
     * Métdo abstrato para calcular o salário final.
     * @return Salário final.
     */
    public abstract double calcularSalario();
}
