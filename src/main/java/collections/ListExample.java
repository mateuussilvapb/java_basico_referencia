package collections;

import java.util.ArrayList;
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
