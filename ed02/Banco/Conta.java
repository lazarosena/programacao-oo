/**
 * Classe base que representa uma conta bancária genérica.
 */
public class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor da classe Conta.
     *
     * @param cliente      Nome do cliente.
     * @param saldoInicial Valor inicial da conta.
     */
    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    /**
     * Realiza um depósito na conta.
     *
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    /**
     * Realiza um saque na conta.
     *
     * @param valor Valor a ser sacado.
     * @return true se o saque for bem-sucedido; false caso contrário.
     */
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    /**
     * Realiza uma transferência entre contas.
     *
     * @param destino Conta de destino.
     * @param valor   Valor a ser transferido.
     * @return true se a transferência for bem-sucedida; false caso contrário.
     */
    public boolean transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return Saldo da conta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime o extrato da conta.
     */
    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$ " + saldo);
    }

    /**
     * Aplica os juros diários da conta.
     * (Padrão: não aplica juros)
     */
    public void aplicarJurosDiarios() {
        // Padrão: sem juros
    }
}
