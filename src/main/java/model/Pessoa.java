public class Pessoa {
    private String nome;
    private Address address;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Address getEndereco() {
        return endereco;
    }
}
