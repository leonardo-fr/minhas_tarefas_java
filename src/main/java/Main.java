public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua X", "Cidade Y");
        Contato contato = new Contato("email@example.com", "+123456789");

        Pessoa pessoa = new Pessoa("Nome", endereco);
        PessoaManager manager = new PessoaManager();
        manager.mostraDetalhesPessoa(pessoa, contato);
    }
}

public class Contato {
    private String email;
    private String celular;

    public Contato(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }
}

public class Endereco {
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }
}

public class Endereco {
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }
}

public class PessoaManager {
    public void mostraDetalhesPessoa(Pessoa pessoa, Contato contato) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco().getRua() + ", " + pessoa.getRua().getCidade());
        mostraDetalhesContato(contato);
    }

    private void mostraDetalhesContato(contato contato) {
        System.out.println("Email: " + Contato.getEmail());
        System.out.println("Telefone: " + Contato.getCelular());
    }
}
