public class PessoaFisica extends Pessoa {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String identificar() {
        return "Nome: " + getNome() + " | CPF: " + this.cpf;
    }
}
