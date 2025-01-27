package stream;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private int idade;
    private Genero genero;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, Genero genero) {
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && genero == pessoa.genero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, genero);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + ", genero=" + genero + '}';
    }
}
