package solid.ocp.vehicleClasses;

/*
 * A classe Vehicle segue o Princípio Aberto-Fechado (OCP) dos princípios SOLID.
 * Ela está projetada para ser estendida, permitindo que novas funcionalidades sejam adicionadas
 * através de subclasses, sem a necessidade de modificar o código existente.
 *
 * Esta classe serve como uma abstração comum para diferentes tipos de veículos, como carros e
 * motocicletas, encapsulando atributos compartilhados (cor, ano e motor) e comportamento
 * básico (método de inicialização do veículo).
 *
 * Subclasses podem herdar esses atributos e métodos, além de adicionar suas próprias
 * características específicas, mantendo a flexibilidade e a extensibilidade do sistema.
 * Por exemplo, a classe 'Car' pode incluir atributos adicionais, como o número de assentos.
 */
public class Vehicle {
    protected String color;
    protected Integer year;
    protected Double engine;

    protected void startVehicle() {
        System.out.println("Ligando o motor...");
    }
}
