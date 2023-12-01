public class PessoaManager {
    public void mostraDetalhesPessoa(Pessoa pessoa, Contato contato) {
        System.out.println("Nome: " + pessoa.getName());
        System.out.println("Endereço: " + pessoa.getAddress().getStreet() + ", " + pessoa.getAddress().getCity());
        displayContactDetails(contact);
    }

    private void displayContactDetails(Contato contato) {
        System.out.println("Email: " + Contato.getEmail());
        System.out.println("Telefone: " + Contato.getPhone());
    }
}
