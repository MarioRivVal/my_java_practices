package Eje_1_vehicles;

public class Car extends Vehicle {

    public Car(String brand){
        super(brand);

    }

    @Override
    public String getType(){
        return "Car";
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing car maintenance");
    }
}
