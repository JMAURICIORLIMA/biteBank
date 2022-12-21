package bank;

public class TesteConta {
    public static void main(String[] args) {
        Cliente Paulo = new Cliente();
        Paulo.nome = "Paulo Augusto";
        Paulo.cpf = "132.111.545-25";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.titular = Paulo;
        System.out.println(contaDoPaulo.titular);
        System.out.println(contaDoPaulo.titular.nome);
//        contaDoPaulo.depositar(200d);
//
//        Conta contaDaAna = new Conta();
//        contaDaAna.saldoDisponivel();
//
//        contaDoPaulo.transfere(50, contaDaAna);
//
//        contaDaAna.saldoDisponivel();
    }
}
