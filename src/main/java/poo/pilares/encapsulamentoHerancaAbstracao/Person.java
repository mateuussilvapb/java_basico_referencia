package poo.pilares.encapsulamentoHerancaAbstracao;

/*
    Em POO, classes são modelos/blueprints para criar objetos.
    Classes podem conter atributos (dados) e métodos (comportamentos).
    Objetos são instâncias de classes, com estado e comportamento.
 */

/*
    Essa classe irá demonstrar o conceito de encapsulamento e herança.
        * Encapsulamento é a ocultação de detalhes internos, protegendo dados.
        * Herança permite que uma classe herde características de outra.
 */
public class Person {

    // Atributos privados (encapsulamento)
    private String name;
    private int age;

    // Construtor padrão
    public Person() {
        this.name = "John Doe";
        this.age = 30;
    }

    // Construtor personalizado
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos públicos para acessar e modificar atributos (encapsulamento)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Método para exibir informações
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Método para verificar se é maior de idade
    public boolean isAdult() {
        return age >= 18;
    }

    // Método para verificar se é idoso
    public boolean isElderly() {
        return age >= 60;
    }

    // Método para cumprimentar
    public void greet() {
        System.out.println("Hello, I'm " + name + "!");
    }

    // Método para despedir
    public void sayGoodbye() {
        System.out.println("Goodbye, " + name + "!");
    }

    // Método para dormir
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    // Método para comer
    public void eat() {
        System.out.println(name + " is eating...");
    }
    // Método para se exercitar
    public void exercise() {
        System.out.println(name + " is exercising...");
    }

    // Método para se divertir
    public void haveFun() {
        System.out.println(name + " is having fun...");
    }
}
