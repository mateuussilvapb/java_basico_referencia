package solid.ocp.vehicleClasses;

public class Motorcycle extends Vehicle {
    public Motorcycle(String color, Integer year, Double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
    }

    public void createMotorcycle() {
        System.out.println("Criando uma moto: " + color + " " + year + " " + engine + " " +
                "cilindradas");
        this.startVehicle();
    }
}
