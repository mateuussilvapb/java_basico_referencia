package solid.ocp.vehicleClasses;

public class Car extends Vehicle {
    private Integer seats;

    public Car(String color, Integer year, Double engine, Integer seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    public void createCar() {
        System.out.println("Criando um carro: " + color + " " + year + " " + engine + " " + seats + " assentos.");
        this.startVehicle();
    }
}
