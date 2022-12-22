package bank;

public class TesteConta {
    public static void main(String[] args) {
        Conta contaDaAntonia = new Conta();
        Cliente antonia = new Cliente("Antônia Freitas", "123.153.441-02",
                "Programadora", "Rua dos Sonhos, 793");

        contaDaAntonia.setAgencia("001");
        contaDaAntonia.setTitular(antonia);
        contaDaAntonia.setNumeroDaConta("010253");
        System.out.println(contaDaAntonia.getTitular().getNome());

        contaDaAntonia.depositar(1500.00);
        System.out.println(contaDaAntonia.saldoDisponivel());

        System.out.println("-----------------------------");

        Conta contaDoMarcos = new Conta();
        Cliente marcos = new Cliente("Marcos Brito", "012.123.344-02",
                "Av. Visconde Barbosa, 132");

        contaDoMarcos.setAgencia("001");
        contaDoMarcos.setTitular(marcos);
        contaDoMarcos.setNumeroDaConta("010203");

        marcos.setProfissao("Programador");

        System.out.println(contaDoMarcos.getTitular().getNome());
//        System.out.println(contaDoMarcos.getTitular()); //Referência da titular
//        System.out.println(marcos.getNome());

        System.out.println(contaDoMarcos.saldoDisponivel());

        contaDaAntonia.transfere(200.00, contaDoMarcos);

        System.out.println(contaDaAntonia.saldoDisponivel());

        System.out.println(contaDoMarcos.saldoDisponivel());

    }
}
