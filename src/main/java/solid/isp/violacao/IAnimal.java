package solid.isp.violacao;

/*
 * A interface 'IAnimal' viola o Princípio da Segregação de Interfaces (ISP), pois
 * força as suas implementações a fornecerem métodos que podem não ser relevantes
 * para todas as classes que a implementam. Isso resulta em uma implementação
 * desnecessária de métodos que não fazem sentido para certos contextos.
 */
public interface IAnimal {
    void eat();

    void fly();

    void swim();
}
