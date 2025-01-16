package lambda;

import java.util.*;

/*
 * Funções lambda, introduzidas no Java 8, são uma forma concisa de escrever implementações de
 * interfaces funcionais (interfaces com apenas um método abstrato). Elas permitem que o código
 * seja mais legível e menos verboso, especialmente quando trabalhamos com coleções ou passamos
 * comportamentos como argumentos para métodos.
 */

public class Main {
    public static void main(String[] args) {
        /*
         * Por baixo dos panos, tanto a versão mais antiga (que seria a declaração de classes
         * anônimas), quanto a versão nova (utilização de expressões lambda), apresentam o mesmo
         * resultado. Porém, a escrita do código se difere. Por vezes, o código é mais legível.
         */

        //Exemplo com a interface funcional Runnable
        RunnableOld.run();
        RunnableNew.run();

        //Exemplo com a interface funcional Comparator
        ComparatorOld.compare();
        ComparatorNew.compare();

        //Exemplo com StreamAPI utilizando map
        StreamApiWithMapOld.squaredNumbers();
        StreamApiWithMapNew.squaredNumbers();

        //Exemplo com StreamAPI utilizando filter
        StreamApiWithFilterOld.filterNames();
        StreamApiWithFilterNew.filterNames();
    }
}

//Sem o uso de expressões lambda
class RunnableOld {
    static void run() {
        System.out.println("==//==//==//==//== RUNNABLE OLD ==//==//==//==//==");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, World (old)!");
            }
        };
        new Thread(runnable).start();
    }
}

//Utilizando expressões lambda
class RunnableNew {
    static void run() {
        System.out.println("==//==//==//==//== RUNNABLE NEW ==//==//==//==//==");
        Runnable runnable = () -> System.out.println("Hello, World (new)!");
        new Thread(runnable).start();
    }
}

//Sem o uso de expressões lambda
class ComparatorOld {
    static void compare() {
        System.out.println("==//==//==//==//== COMPARATOR OLD ==//==//==//==//==");
        List<String> names = Arrays.asList("Zeneuda", "Mateus", "Marcos", "Lucas", "João", "Maria"
                , "José");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String name : names) {
            System.out.println(name);
        }
    }
}

//Utilizando expressões lambda
class ComparatorNew {
    static void compare() {
        System.out.println("==//==//==//==//== COMPARATOR NEW ==//==//==//==//==");
        List<String> names = Arrays.asList("Zeneuda", "Mateus", "Marcos", "Lucas", "João", "Maria"
                , "José");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        names.forEach(System.out::println);
    }
}

//Sem o uso de expressões lambda
class StreamApiWithMapOld {
    static void squaredNumbers() {
        System.out.println("==//==//==//==//== STREAM API WITH MAP OLD ==//==//==//==//==");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squaredNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            squaredNumbers.add(number * number);
        }

        for (Integer square : squaredNumbers) {
            System.out.println(square);
        }
    }
}

//Utilizando expressões lambda
class StreamApiWithMapNew {
    static void squaredNumbers() {
        System.out.println("==//==//==//==//== STREAM API WITH MAP NEW ==//==//==//==//==");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squaredNumbers = numbers.stream().map((n) -> n * n).toList();
        squaredNumbers.forEach(System.out::println);
    }
}

//Sem o uso de expressões lambda
class StreamApiWithFilterOld {
    static void filterNames() {
        System.out.println("==//==//==//==//== STREAM API WITH FILTER OLD ==//==//==//==//==");
        List<String> names = Arrays.asList("Zeneuda", "Mateus", "Marcos", "Lucas", "João", "Maria"
                , "José");
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("M")) {
                filteredNames.add(name);
            }
        }

        for (String name : filteredNames) {
            System.out.println(name);
        }
    }
}

//Utilizando expressões lambda
class StreamApiWithFilterNew {
    static void filterNames() {
        System.out.println("==//==//==//==//== STREAM API WITH FILTER NEW ==//==//==//==//==");
        List<String> names = Arrays.asList("Zeneuda", "Mateus", "Marcos", "Lucas", "João", "Maria"
                , "José");
        List<String> filteredNames = names.stream().filter((name) -> name.startsWith(("M"))).toList();
        filteredNames.forEach(System.out::println);
    }
}