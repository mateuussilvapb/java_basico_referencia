package solid.isp.respeito;

/*
 * A classe 'Bird' implementa as interfaces 'IEater' e 'IFlyer', respeitando
 * o Princípio da Segregação de Interfaces (ISP).
 * Ao adotar interfaces menores e específicas, 'Bird' fornece implementações
 * apenas para os métodos que são relevantes ao seu comportamento, evitando a
 * necessidade de implementar métodos desnecessários.
 */
public class Bird implements IEater, IFlyer {
    @Override
    public void eat() {
        // Implementação relevante para Bird
    }

    @Override
    public void fly() {
        // Implementação relevante para Bird
    }
}
