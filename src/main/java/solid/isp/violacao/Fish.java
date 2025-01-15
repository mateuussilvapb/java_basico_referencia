package solid.isp.violacao;

/*
 * A classe 'Fish' implementa a interface 'IAnimal', sendo forçada a fornecer uma implementação
 * para o método 'fly', mesmo que peixes não voem. Isso leva a uma implementação vazia ou irrelevante,
 * violando o Princípio da Segregação de Interfaces (ISP).
 * O ISP recomenda dividir interfaces grandes em interfaces menores e mais específicas,
 * de modo que cada classe implemente apenas os métodos que são relevantes para ela.
 */
public class Fish implements IAnimal {
    @Override
    public void eat() {
        // Implementação relevante para Fish
    }

    @Override
    public void fly() {
        // Implementação desnecessária, pois peixes não voam
    }

    @Override
    public void swim() {
        // Implementação relevante para Fish
    }
}
