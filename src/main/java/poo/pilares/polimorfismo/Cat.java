package poo.pilares.polimorfismo;

/*
    Observe que a classe Cat implementa a interface Animal e sobrescreve o método makeSound().
    Da mesma forma, a classe Dog também implementa a interface Animal e sobrescreve o método
    makeSound().
 */

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
