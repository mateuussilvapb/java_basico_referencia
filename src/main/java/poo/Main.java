package poo;

import poo.pilares.encapsulamentoHerancaAbstracao.Person;
import poo.pilares.encapsulamentoHerancaAbstracao.Worker;
import poo.pilares.polimorfismo.Animal;
import poo.pilares.polimorfismo.Cat;
import poo.pilares.polimorfismo.Dog;

public class Main {

    /*
    Programação Orientada a Objetos (POO):
        Organiza código em objetos com estado e comportamento
        Permite reutilização, modularidade e abstração de complexidade.
        POO é um paradigma de programação baseado em "objetos" que contém:
            * Classes: Modelos/blueprints para criar objetos
            * Objetos: Instâncias de classes com estado e comportamento

        Os 4 pilares da POO são:
            * Encapsulamento: Ocultação de detalhes internos, protegendo dados
            * Herança: Permite que uma classe herde características de outra
            * Polimorfismo: Capacidade de um objeto ser tratado como diferentes tipos
            * Abstração: Simplificação de sistemas complexos através de representações essenciais

        Benefícios principais:
            * Código mais organizado e reutilizável
            * Facilita manutenção e expansão de sistemas
            * Promove modularidade e separação de responsabilidades
     */

    public static void main(String[] args) {
        /*
            A herança permite que uma classe herde características de outra.
            A classe filha (subclasse) herda atributos e métodos da classe pai (superclasse).
            Porém, a classe pai (superclasse) não herda características da classe filha.
                * person.setSalary(2000): Erro: Person não possui o método setSalary()
         */
        Person person = new Person("Alice", 25);
        Worker worker = new Worker("Bob", 30, 3000);
        System.out.println("Person:" + person.getName() + " is adult: " + person.isAdult());
        System.out.println("Worker:" + worker.getName() + " is adult: " + worker.isAdult() + " is rich: " + worker.isRich());

        /*
            Já no polimorfismo, um objeto pode ser referenciado de várias formas.
            Observe que para instanciar os objetos, utilizou-se a interface Animal e não a
            implementação específica (Dog e Cat). Isso permite que o código seja mais flexível
            e fácil de manter, pois é possível trocar a implementação sem alterar o código.
            Isso é o polimorfismo em ação.
         */
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
