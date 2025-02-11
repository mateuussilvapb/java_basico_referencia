package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    /*
     * O HashSet em Java é uma implementação da interface Set baseada em uma tabela de espalhamento (hash table).
     * Ele não permite elementos duplicados e não garante a ordem de inserção dos elementos. Seu principal benefício é
     * a alta performance para operações de busca, inserção e remoção, pois essas operações possuem complexidade
     * próxima de O(1). No entanto, se a ordem dos elementos for importante, pode ser necessário utilizar outra implementação
     * como LinkedHashSet ou TreeSet.
     */
    public static void hashSet() {
        Set<Pessoa> pessoas = new HashSet<>();
        Pessoa p = new Pessoa(1L, "Mateus");
        pessoas.add(p);
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n=====================");
        pessoas.add(p);
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\n\n=====================");
        pessoas.add(new Pessoa(1L, "Mateus"));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
