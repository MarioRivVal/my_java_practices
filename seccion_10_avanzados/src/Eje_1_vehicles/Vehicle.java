package Eje_1_vehicles;

abstract public class Vehicle {

    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;

    }

    abstract public String getType();

    abstract public void performMaintenance();

    public void printBrand(){
        System.out.println("Vehicle brand: " + this.brand);
    }

}
