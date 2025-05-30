/**
 * Representa uma conta corrente com juros de 0.1% ao dia.
 */
public class ContaCorrente extends Conta {

    /**
     * Construtor da ContaCorrente.
     *
     * @param cliente      Nome do cliente.
     * @param saldoInicial Valor inicial da conta.
     */
    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * Aplica juros diários de 0.1%.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.001;
    }

    /**
     * Imprime o extrato incluindo o tipo de conta.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}
