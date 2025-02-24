package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {

    /*
     * O **ArrayList** em Java é uma implementação da interface `List`, baseada em um array dinâmico.
     * Ele permite o armazenamento ordenado de elementos, permitindo duplicatas e acesso rápido por índice.
     * Diferente de arrays fixos, o `ArrayList` pode aumentar ou diminuir de tamanho automaticamente conforme
     * elementos são adicionados ou removidos. Sua principal vantagem é a velocidade no acesso a elementos por índice,
     * mas inserções e remoções no meio da lista podem ser custosas em termos de desempenho.
     */
    public static void arrayList() {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa p = new Pessoa(1L, "Mateus");
        pessoas.add(p);
        pessoas.add(new Pessoa(1L, "Mateus"));
        pessoas.add(new Pessoa(5L, "Ana"));
        pessoas.add(new Pessoa(2L, "Carlos"));
        pessoas.add(new Pessoa(6L, "Beatriz"));
        pessoas.add(new Pessoa(3L, "Eduardo"));
        pessoas.add(new Pessoa(10L, "Fernanda"));
        pessoas.add(new Pessoa(20L, "Gabriel"));
        pessoas.add(new Pessoa(15L, "Mariana"));
        pessoas.add(new Pessoa(13L, "Roberto"));
        pessoas.add(new Pessoa(11L, "Vanessa"));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == ADICIONANDO NO FINAL DA LISTA == ==");
        pessoas.add(p);
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == ADICIONANDO EM POSIÇÃO ESPECÍFICA DA LISTA == ==");
        pessoas.add(1, p);
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == REMOVENDO ELEMENTO DE POSIÇÃO ESPECÍFICA DA LISTA == ==");
        pessoas.remove(1);
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == REMOVENDO A PRIMEIRA OCORRÊNCIA DO OBJETO ENCONTRADO NA LISTA == ==");
        pessoas.remove(new Pessoa(2L, "Desterro"));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == SUBSTITUINDO UM ELEMENTO EM UM ÍNDICE POR OUTRO ELEMENTO == ==");
        pessoas.set(0, new Pessoa(30L, "Zeneuda"));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == VERIFICANDO SE DETERMINADO ELEMENTO EXISTE NA LISTA == ==");
        System.out.println(pessoas.contains(p));

        System.out.println("\n\n== == RETORNANDO O ÍNDICE DA PRIMEIRA OCORRÊNCIA DO ELEMENTO, OU -1 SE NÃO FOR ENCONTRADO == ==");
        System.out.println(pessoas.indexOf(new Pessoa(6L, "Fernanda")));

        System.out.println("\n\n== == RETORNANDO O ÍNDICE DA ÚLTIMA OCORRÊNCIA DO ELEMENTO, OU -1 SE NÃO FOR ENCONTRADO == ==");
        System.out.println(pessoas.indexOf(p));

        System.out.println("\n\n== == RETORNANDO O TAMANHO ATUAL DA LISTA == ==");
        System.out.println(pessoas.size());

        System.out.println("\n\n== == EXECUTANDO UMA AÇÃO PARA CADA ELEMENTO DA LISTA == ==");
        pessoas.forEach(System.out::println);

        System.out.println("\n\n== == GERANDO UMA SUBLISTA A PARTIR DE ÍNDICES DE INÍCIO E FIM DA LISTA ORIGINAL == ==");
        List<Pessoa> subList = pessoas.subList(2, 4);
        for (Pessoa pessoa : subList) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == PEGANDO UM ELEMENTO ESPECÍFICO NA LISTA PELO ÍNDICE == ==");
        System.out.println(pessoas.get(2));

        System.out.println("\n\n== == ORDENANDO A LISTA DE ACORDO COM CRITÉRIOS == ==");
        pessoas.sort(Comparator.comparing(Pessoa::getId));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == MODIFICANDO TODOS OS ELEMENTOS DA LISTA DE ACORDO COM UMA FUNÇÃO FORNECIDA == ==");
        pessoas.replaceAll(pessoa -> {
            pessoa.setId(10L);
            pessoa.setNome("TESTE");
            return pessoa;
        });
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == LIMPANDO TODA A LISTA == ==");
        pessoas.clear();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == VERIFICANDO SE LISTA ESTÁ VAZIA == ==");
        System.out.println(pessoas.isEmpty());

    }
}
