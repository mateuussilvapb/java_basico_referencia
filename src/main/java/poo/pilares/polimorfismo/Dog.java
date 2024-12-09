package poo.pilares.polimorfismo;

/*
    Observe que a classe Dog implementa a interface Animal e sobrescreve o método makeSound().
    Da mesma forma, a classe Cat também implementa a interface Animal e sobrescreve o método makeSound().
 */
public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}
