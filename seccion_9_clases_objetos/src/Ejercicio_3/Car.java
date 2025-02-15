package Ejercicio_3;

public class Car {

    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand, String model, Engine engine){
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void printDetails(){
        System.out.println(model + " is a " + brand + " car, with " + engine.getPower() + " of power" );
    }
}
