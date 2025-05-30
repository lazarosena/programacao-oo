/**
 * Representa uma conta poupança com juros de 0.08% ao dia.
 */
public class ContaPoupanca extends Conta {

    /**
     * Construtor da ContaPoupanca.
     *
     * @param cliente      Nome do cliente.
     * @param saldoInicial Valor inicial da conta.
     */
    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    /**
     * Aplica juros diários de 0.08%.
     */
    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.0008;
    }

    /**
     * Imprime o extrato incluindo o tipo de conta.
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}
