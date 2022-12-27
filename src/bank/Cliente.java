package bank;

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;
    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        if (nome.isBlank() || cpf.length() != 11 || endereco.isBlank() || endereco.length() < 10) {
            System.out.println("Cliente não poderá ser criado, dados incossitentes.");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Cliente(String nome, String cpf, String profissao, String endereco) {
        this(nome, cpf, endereco);
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
