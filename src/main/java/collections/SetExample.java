package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    /*
     * O HashSet em Java é uma implementação da interface Set baseada em uma tabela de espalhamento (hash table).
     * Ele não permite elementos duplicados e não garante a ordem de inserção dos elementos. Para
     *  que a unicidade dos elementos funcione corretamente, caso o set esteja armazenando
     * objetos personalizados, é necessário que o objeto implemente o equals e hashCode
     * corretamente.
     *  Seu principal benefício é a alta performance para operações de busca, inserção e remoção,
     * pois essas operações possuem complexidade próxima de O(1). No entanto, se a ordem dos
     * elementos for importante, pode ser necessário utilizar outra implementação como LinkedHashSet
     * ou TreeSet.
     */
    public static void hashSet() {
        Set<Pessoa> pessoas = new HashSet<>();
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

        System.out.println("\n\n== == ADICIONANDO ELEMENTO AO CONJUNTO, SEM ORDENAÇÃO (SE JÁ EXISTIR, NÃO SERÁ ADICIONADO) == ==");
        pessoas.add(new Pessoa(25L, "Zeneuda"));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == ADICIONANDO ELEMENTOS DE OUTRA COLEÇÃO AO CONJUNTO == ==");
        Set<Pessoa> outrasPessoas = new HashSet<>();
        outrasPessoas.add(new Pessoa(30L, "Marcos"));
        outrasPessoas.add(new Pessoa(31L, "Querubina"));
        outrasPessoas.add(new Pessoa(32L, "Mailson"));
        outrasPessoas.add(new Pessoa(33L, "Miraci"));
        pessoas.addAll(outrasPessoas);
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == REMOVENDO UM ELEMENTO DO CONJUNTO, CASO O ELEMENTO ESTEJA PRESENTE ELEMENTOS DE OUTRA COLEÇÃO AO CONJUNTO == ==");
        pessoas.remove(new Pessoa(32L, "Mailson"));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == VERIFICANDO SE O CONJUNTO CONTÉM DETERMINADO ELEMENTO == ==");
        System.out.println(pessoas.contains(new Pessoa(31L, "Marcos")));

        System.out.println("\n\n== == VERIFICANDO O NÚMERO DE ELEMENTOS PRESENTES NO CONJUNTO == ==");
        System.out.println(pessoas.size());

        System.out.println("\n\n== == PERCORRENDO O CONJUNTO COM ITERATOR == ==");
        Iterator<Pessoa> pessoasIterator = pessoas.iterator();
        while (pessoasIterator.hasNext()) {
            System.out.println(pessoasIterator.next());
        }

        System.out.println("\n\n== == PERCORRENDO O CONJUNTO COM FOR EACH == ==");
        pessoas.forEach(System.out::println);

        System.out.println("\n\n== == VERIFICANDO SE CONJUNTO POSSUI TODOS OS ELEMENTOS PRESENTES EM OUTRO CONJUNTO == ==");
        Set<Pessoa> pessoasToCheck = new HashSet<>();
        pessoasToCheck.add(new Pessoa(2L, "Carlos"));
        pessoasToCheck.add(new Pessoa(6L, "Beatriz"));
        pessoasToCheck.add(new Pessoa(3L, "Eduardo"));
        pessoasToCheck.add(new Pessoa(10L, "Fernanda"));
        pessoasToCheck.add(new Pessoa(20L, "Gabriel"));
        pessoasToCheck.add(new Pessoa(15L, "Mariana"));
        pessoasToCheck.add(new Pessoa(13L, "Roberto"));
        System.out.println(pessoas.containsAll(pessoasToCheck));

        System.out.println("\n\n== == REMOVENDO TODOS OS ELEMENTOS PRESENTES EM OUTRO CONJUNTO == ==");
        Set<Pessoa> pessoasToRemove = new HashSet<>();
        pessoasToRemove.add(new Pessoa(1L, "Mateus"));
        pessoasToRemove.add(new Pessoa(5L, "Ana"));
        pessoasToRemove.add(new Pessoa(2L, "Carlos"));
        pessoasToRemove.add(new Pessoa(6L, "Beatriz"));
        pessoas.removeAll(pessoasToRemove);
        pessoas.forEach(System.out::println);

        System.out.println("\n\n== == MANTENDO APENAS ELEMENTOS PRESENTES EM OUTRO CONJUNTO == ==");
        Set<Pessoa> pessoasToRetain = new HashSet<>();
        pessoasToRetain.add(new Pessoa(6L, "Beatriz"));
        pessoasToRetain.add(new Pessoa(3L, "Eduardo"));
        pessoasToRetain.add(new Pessoa(10L, "Fernanda"));
        pessoasToRetain.add(new Pessoa(20L, "Gabriel"));
        pessoasToRetain.add(new Pessoa(15L, "Mariana"));
        pessoas.retainAll(pessoasToRetain);
        pessoas.forEach(System.out::println);

        System.out.println("\n\n== == REMOVENDO TODOS OS ELEMENTOS DO CONJUNTO == ==");
        pessoas.clear();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n== == VERIFICANDO SE O CONJUNTO ESTÁ VAZIO == ==");
        System.out.println(pessoas.isEmpty());
    }
}
