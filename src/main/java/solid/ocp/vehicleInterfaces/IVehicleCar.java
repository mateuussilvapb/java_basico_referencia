package solid.ocp.vehicleInterfaces;

/*
    Essa é outra maneira de respeitar princípios OCP. Ao invés de criar uma classe estensível,
    criamos interfaces que especificam o que cada tipo de veículo deverá implementar.
 */

public interface IVehicleCar {
    public void configureCar(String color, Integer year, Double engine, Integer seats);
    public void startVehicle();
}
