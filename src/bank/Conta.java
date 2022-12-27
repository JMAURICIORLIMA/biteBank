package bank;

public class Conta {
    private double saldo;
    private String agencia;
    private String numeroDaConta;
    private Cliente titular;
    private static int contasAbertas;

    public Conta(String agencia, String numeroDaConta, Cliente titular) {
        if (!verificaAgenciaEConta(agencia, numeroDaConta)) {
            System.out.println("Conta não pode ser criada.");
        } else {
            this.agencia = agencia;
            this.numeroDaConta = numeroDaConta;
            this.titular = titular;
            Conta.contasAbertas++;
        }
    }

    public Boolean verificaAgenciaEConta(String agencia, String numeroDaConta) {
        return agencia.length() == 3 && !agencia.isBlank()
                && (numeroDaConta.length() == 8 && !numeroDaConta.isBlank());
    }

    public Boolean verificaAgenciaEConta() {
        return agencia.length() == 3 && !agencia.isBlank()
                && (numeroDaConta.length() == 8 && !numeroDaConta.isBlank());
    }

    public double saldoDisponivel() {
        return this.saldo;
    }

    public void depositar(Double valor) {
        if (valor <= 0) {
            System.out.println("Operação negada");
        } else {
            this.saldo += valor;
            System.out.println("Depósito realizado R$" + valor);
        }
    }

    public boolean saca(double valor) {
        if (saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (saldo < valor) {
            return false;
        } else {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Cliente getTitular() {
        return titular;
    }

}
