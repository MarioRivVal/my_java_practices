package Eje_1_vehicles;

public class Motorcycle extends Vehicle{

    public Motorcycle(String brand){
        super(brand);

    }

    @Override
    public String getType(){
        return "Motorcycle";
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing motorcycle maintenance");
    }
}
