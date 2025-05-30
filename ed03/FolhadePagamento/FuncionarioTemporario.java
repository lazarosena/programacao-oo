package FolhadePagamento;

/**
 * Funcionario Temporário que tem desconto fixo.
 */
public class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase - 100;
    }
}