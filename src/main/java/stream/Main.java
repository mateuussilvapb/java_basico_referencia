package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = gerarListaDePessoas();

        //Filter
        System.out.println("//==//==//==//==//==//==// FILTER //==//==//==//==//==//==//");
        List<Pessoa> maioresDeVinteECinco = pessoas.stream().filter(pessoa -> {
            return pessoa.getIdade() > 25;
        }).toList();
        maioresDeVinteECinco.forEach(System.out::println);

        //Sort
        System.out.println("\n\n//==//==//==//==//==//==// SORT //==//==//==//==//==//==//");
        List<Pessoa> pessoasOrdenadas = pessoas.stream().sorted(
                Comparator
                        .comparing(Pessoa::getIdade)
                        //Caso quisessem em ordem decrescente
                        // .comparing(Pessoa::getIdade, Comparator.reverseOrder())
                        .thenComparing(Pessoa::getNome)
                        .thenComparing(Pessoa::getGenero)
        ).toList();
        pessoasOrdenadas.forEach(System.out::println);

        //Map
        System.out.println("\n\n//==//==//==//==//==//==// MAP //==//==//==//==//==//==//");
        List<PessoaDTO> pessoasDTO = pessoas.stream().map(
                PessoaDTO::fromPessoa
        ).toList();
        pessoasDTO.forEach(System.out::println);

        //Encadeando funções
        System.out.println("\n\n//==//==//==//==//==//==// ENCADEANDO FUNÇÕES " +
                "//==//==//==//==//==//==//");
        List<PessoaDTO> pessoasEncadeadasDTO = pessoas.stream()
                .map(
                        PessoaDTO::fromPessoa
                )
                .sorted(
                        Comparator.comparing(PessoaDTO::getIdade, Comparator.reverseOrder())
                )
                .toList();
        pessoasDTO.forEach(System.out::println);

        //Max
        System.out.println("\n\n//==//==//==//==//==//==// MAX //==//==//==//==//==//==//");
        Optional<Pessoa> maisVelho = pessoas.stream().max(
                Comparator.comparing(Pessoa::getIdade)
        );
        maisVelho.ifPresent(System.out::println);

        //Min
        System.out.println("\n\n//==//==//==//==//==//==// MIN //==//==//==//==//==//==//");
        Optional<Pessoa> maisNovo = pessoas.stream().min(
                Comparator.comparing(Pessoa::getIdade)
        );
        maisNovo.ifPresent(System.out::println);

        //All Match
        System.out.println("\n\n//==//==//==//==//==//==// ALL MATCH //==//==//==//==//==//==//");
        boolean pessoasAllMatch = pessoas.stream().allMatch(pessoa -> pessoa.getIdade() > 15);
        System.out.println(pessoasAllMatch);

        //Any Match
        System.out.println("\n\n//==//==//==//==//==//==// ANY MATCH //==//==//==//==//==//==//");
        boolean pessoasAnyMatch = pessoas.stream().anyMatch(pessoa -> pessoa.getIdade() == 40);
        System.out.println(pessoasAnyMatch);

        //None Match
        System.out.println("\n\n//==//==//==//==//==//==// NONE MATCH //==//==//==//==//==//==//");
        boolean pessoasNoneMatch = pessoas.stream().noneMatch(pessoa -> pessoa.getIdade() < 19);
        System.out.println(pessoasNoneMatch);


        //Reduce
        System.out.println("\n\n//==//==//==//==//==//==// REDUCE //==//==//==//==//==//==//");
        Integer somaIdades = pessoas.stream().reduce(0,
                (soma, pessoa) -> soma + pessoa.getIdade(), Integer::sum);
        System.out.println(somaIdades);

        //MapToInt
        System.out.println("\n\n//==//==//==//==//==//==// MAP TO INT //==//==//==//==//==//==//");
        Integer somaIdadesMapToInt = pessoas.stream().mapToInt(Pessoa::getIdade).sum();
        System.out.println(somaIdadesMapToInt);

    }

    public static List<Pessoa> gerarListaDePessoas() {
        return List.of(
                new Pessoa("João", 25, Genero.MASCULINO),
                new Pessoa("Maria", 30, Genero.FEMININO),
                new Pessoa("Carlos", 40, Genero.MASCULINO),
                new Pessoa("Ana", 22, Genero.FEMININO),
                new Pessoa("Pedro", 28, Genero.MASCULINO),
                new Pessoa("Luiza", 35, Genero.FEMININO),
                new Pessoa("Fernando", 27, Genero.MASCULINO),
                new Pessoa("Camila", 29, Genero.FEMININO),
                new Pessoa("Bruno", 33, Genero.MASCULINO),
                new Pessoa("Clara", 26, Genero.FEMININO),
                new Pessoa("Rafael", 32, Genero.MASCULINO),
                new Pessoa("Sofia", 24, Genero.FEMININO),
                new Pessoa("Gustavo", 36, Genero.MASCULINO),
                new Pessoa("Isabela", 31, Genero.FEMININO),
                new Pessoa("Eduardo", 23, Genero.MASCULINO),
                new Pessoa("Fernanda", 37, Genero.FEMININO),
                new Pessoa("Leonardo", 34, Genero.MASCULINO),
                new Pessoa("Mariana", 21, Genero.FEMININO),
                new Pessoa("Rodrigo", 38, Genero.MASCULINO),
                new Pessoa("Tatiana", 39, Genero.FEMININO),
                new Pessoa("Alex", 19, Genero.MASCULINO),
                new Pessoa("Larissa", 20, Genero.FEMININO),
                new Pessoa("Thiago", 29, Genero.MASCULINO),
                new Pessoa("Patrícia", 27, Genero.FEMININO),
                new Pessoa("Marcelo", 45, Genero.MASCULINO),
                new Pessoa("Juliana", 41, Genero.FEMININO),
                new Pessoa("André", 33, Genero.MASCULINO),
                new Pessoa("Simone", 30, Genero.FEMININO),
                new Pessoa("Victor", 28, Genero.MASCULINO),
                new Pessoa("Beatriz", 22, Genero.FEMININO)
        );
    }
}
