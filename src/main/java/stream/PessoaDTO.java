package stream;

public class PessoaDTO {

    private String nome;
    private int idade;
    private String genero;

    public PessoaDTO() {
    }

    public PessoaDTO(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static PessoaDTO fromPessoa(Pessoa pessoa) {
        return new PessoaDTO(
                pessoa.getNome(),
                pessoa.getIdade(),
                pessoa.getGenero() != null ? pessoa.getGenero().name() : null
        );
    }

    public Pessoa toPessoa() {
        return new Pessoa(
                this.nome,
                this.idade,
                this.genero != null ? Genero.valueOf(this.genero) : null
        );
    }

    @Override
    public String toString() {
        return "PessoaDTO{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'' +
                '}';
    }
}
