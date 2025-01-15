package solid.isp.respeito;

/**
 * A classe 'Fish' implementa as interfaces 'IEater' e 'ISwimmer', aderindo ao
 * Princípio da Segregação de Interfaces (ISP).
 * Ao separar os comportamentos em interfaces menores e específicas, 'Fish'
 * implementa apenas os métodos que são relevantes para sua funcionalidade,
 * evitando implementações desnecessárias ou irrelevantes.
 */
public class Fish implements IEater, ISwimmer {
    @Override
    public void eat() {
        // Implementação relevante para Fish
    }

    @Override
    public void swim() {
        // Implementação relevante para Fish
    }
}
