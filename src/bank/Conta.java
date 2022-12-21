package bank;

public class Conta {
    public double saldo;
    public int agencia;
    public int numero;
    public Cliente titular;

    public void saldoDisponivel() {
        System.out.println("Saldo atual R$ " + this.saldo);
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
        if (saldo < valor){
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


}
