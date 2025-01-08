package solid.ocp;

import solid.ocp.vehicleClasses.Car;
import solid.ocp.vehicleClasses.Motorcycle;

public class Main {

    /*
        O princípio do aberto/fechado (OCP) diz que uma classe deve estar aberta para extensão,
        mas fechada para modificação:
            - Uma classe deve permitir que o seu comportamento seja estendido sem precisar modificar
             o seu código-fonte original
            - Isso promove maior flexibilidade e reduz o risco de introduzir bugs ao adicionar
            novas funcionalidades

     */

    public static void main(String[] args) {
        /*
            Exemplo que viola OCP.
            Observe que, caso o tipo do veículo seja MOTORCYCLE, alguns atributos não são
            utilizados.
         */
        TypeVehicle type = TypeVehicle.MOTORCYCLE;
        Vehicle vehicle = new Vehicle("Black", 2020, 2.0, 5);
        if (type == TypeVehicle.CAR) {
            vehicle.car();
        } else if (type == TypeVehicle.MOTORCYCLE) {
            vehicle.motorcycle();
        }

        /*
            Exemplo que respeita o OCP.
         */
        if (type == TypeVehicle.CAR) {
            Car car = new Car("Branco", 2024, 1300.0, 5);
            car.createCar();
        } else if (type == TypeVehicle.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle("Vermelho", 2024, 160.0);
            motorcycle.createMotorcycle();
        }
    }
}

/*
    O exemplo a seguir viola o princípio Aberto/Fechado, porque a classe é muito atômica.
    Perceba que a classe Vehicle possui métodos que correspondem tanto a um carro, quanto a uma
    moto.
    O método relacionado a moto não faz uso de algumas propriedades, como color ou seats.
    Além disso, caso fosse necessário adicionar algum atributo específico para a moto,
     bem como algum método, isso poderia impactar no carro e vice versa.

 */
class Vehicle {
    private String color;
    private Integer year;
    private Double engine;
    private Integer seats;

    public Vehicle(String color, Integer year, Double engine, Integer seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car() {
        System.out.println("Criando um carro: " + color + " " + year + " " + engine + " " + seats + " assentos.");
        startVehicle();
    }

    void motorcycle() {
        System.out.println("Criando uma moto: " + color + " " + year + " " + engine);
        startVehicle();
    }

    private void startVehicle() {
        System.out.println("Ligando o motor...");
    }

}

enum TypeVehicle {
    CAR,
    MOTORCYCLE
}