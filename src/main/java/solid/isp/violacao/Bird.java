package solid.isp.violacao;

/*
 * Ao implementar a interface 'IAnimal', a classe 'Bird' é forçada a fornecer uma implementação
 * para o método 'swim', mesmo que pássaros geralmente não nadem. Isso resulta em uma implementação
 * vazia ou irrelevante, violando o Princípio da Segregação de Interfaces (ISP).
 * Esse princípio sugere que as interfaces devem ser divididas em interfaces menores e mais específicas,
 * de modo que as classes não sejam obrigadas a implementar métodos que não são pertinentes ao seu contexto.
 */
public class Bird implements IAnimal {
    @Override
    public void eat() {
        // Implementação relevante para Bird
    }

    @Override
    public void fly() {
        // Implementação relevante para Bird
    }

    @Override
    public void swim() {
        // Implementação desnecessária, pois pássaros não nadam
    }
}