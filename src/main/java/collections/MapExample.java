package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    /*
     * O HashMap em Java é uma implementação da interface Map baseada em uma tabela de espalhamento (hash table).
     * Ele armazena pares chave-valor, permitindo acesso rápido aos valores por meio das chaves. O HashMap não garante
     * ordem dos elementos e aceita chaves nulas e valores nulos. Sua principal vantagem é a eficiência na busca, inserção e
     * remoção, que geralmente ocorrem em tempo O(1). Para manter a ordem de inserção, pode-se usar LinkedHashMap, e
     * para ordenação automática das chaves, TreeMap.
     */
    public static void hashMap() {
        Map<Long, Pessoa> pessoas = new HashMap<>();
        Pessoa p = new Pessoa(1L, "Mateus");
        pessoas.put(p.getId(), p);
        System.out.println(pessoas.get(1L));

        System.out.println("\n\n=====================");
        pessoas.put(p.getId(), p);
        System.out.println(pessoas.get(1L));

        /*
         * O Map não aceita chaves duplicadas. Ao utilizar a mesma chave em um put, o HashMap irá
         *  substituir o valor informado para a chave
         */
        System.out.println("\n\n=====================");
        pessoas.put(p.getId(), new Pessoa(2L, "Maria"));
        System.out.println(pessoas.get(1L));
    }
}
