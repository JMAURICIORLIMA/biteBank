package bank;

public class TesteConta {
    public static void main(String[] args) {

        Conta contaDaAntonia = new Conta("001", "112233-4",
                new Cliente("Antônia Freitas", "12315344102", "Programadora",
                        "Rua dos Sonhos, 793"));

        System.out.println(contaDaAntonia.getTitular().getNome());
        System.out.println(contaDaAntonia.getAgencia());
        System.out.println(contaDaAntonia.getNumeroDaConta());

        contaDaAntonia.depositar(1200.00);
        System.out.println(contaDaAntonia.saldoDisponivel());

        System.out.println("-----------------------------------------------");

        Conta contaDoJoao = new Conta("001", "156325-0",
                new Cliente("João José", "12344585288", "Rua do futuro, 941"));

        System.out.println(contaDoJoao.getTitular().getNome());
        System.out.println(contaDoJoao.getAgencia());
        System.out.println(contaDoJoao.getNumeroDaConta());

        contaDoJoao.depositar(300d);
        System.out.println(contaDoJoao.saldoDisponivel());

        System.out.println("-----------------------------------------------");

        contaDaAntonia.transfere(200d, contaDoJoao);

        System.out.println(contaDaAntonia.saldoDisponivel());

        System.out.println("-----------------------------------------------");

        System.out.println(contaDoJoao.saldoDisponivel());

        System.out.println("-----------------------------------------------");

        //Cliente não poderá ser criado, pois existe incosistencia no cadastro.
        Conta contaDaAmelia = new Conta("001", "132115-1",
                new Cliente("Amelia da Silva", "94512556618", "Gestora de projetos", "Rua 1"));
    }
}
