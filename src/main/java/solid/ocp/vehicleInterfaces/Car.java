package solid.ocp.vehicleInterfaces;

public class Car implements IVehicleCar {

    private String color;
    private Integer year;
    private Double engine;
    private Integer seats;

    public Car(String color, Integer year, Double engine, Integer seats) {
        this.configureCar(color, year, engine, seats);
    }

    @Override
    public void configureCar(String color, Integer year, Double engine, Integer seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Criando um carro com interface: " + color + " " + year + " " + engine + " " + seats + " assentos");

        this.startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os motores com Interface.");
    }
}
