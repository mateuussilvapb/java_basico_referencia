package generics;


import java.util.List;

public class Main {

    /*
    Generics em Java:
        * Permitem criar classes, interfaces e métodos que podem trabalhar com diferentes tipos
        * Fornecem segurança de tipo em tempo de compilação
        * Reduzem a necessidade de conversões de tipo (casting)
        * Possibilitam código mais reutilizável e flexível
     */

    public static void main(String[] args) {
        /*
         * Exemplo do uso de generics em uma classe
         */
        Box<Integer> integerBox = new Box<>();
        integerBox.setObjeto(10);
        System.out.println("Integer Value: " + integerBox.getObjeto());

        Box<String> stringBox = new Box<>();
        stringBox.setObjeto("Hello World");
        System.out.println("String Value: " + stringBox.getObjeto());

        /*
         * Exemplo do uso de generics em um método
         */
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Utils.printArray(intArray);

        String[] stringArray = {"Hello", "World"};
        Utils.printArray(stringArray);

        /*
         * Exemplo do uso de generics em um método estático
         */
        System.out.println("Sum of 10 and 20: " + Calculator.sum(10, 20));
        System.out.println("Sum of 13.6 and 76: " + Calculator.sum(13.6, 76));
        System.out.println("Sum of 54.3 and 235.7: " + Calculator.sum(54.3, 235.7));

        /*
         * Exemplo do uso de generics com wildcards
         */
        printList(List.of(1, 2, 3, 4, 5));
        printList(List.of("Hello", "World"));
        printList(List.of(true, false, true, false));
    }

    /*
     * Exemplo do uso de generics com wildcards.
     * Essa utilização é útil quando não se sabe o tipo de dado que será utilizado.
     * Porém, ela não é recomendada, exatamente por não se saber o tipo de dado que será utilizado.
     * Essa aplicação pode levar a erros de execução.
     */
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem + " ");
        }
    }
}