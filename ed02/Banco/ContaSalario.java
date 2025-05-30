/**
 * Representa uma conta salário que não aplica juros.
 */
public class ContaSalario extends Conta {

    /**
     * Construtor da ContaSalario.
     *
     * @param cliente      Nome do cliente.
     * @param saldoInicial Valor inicial da conta.
     */
    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * Não aplica juros na Conta Salário.
     */
    @Override
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }

    /**
     * Imprime o extrato incluindo o tipo de conta.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Salário ===");
        super.imprimirExtrato();
    }
}
