package Eje_1_vehicles;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Jeep");
        Motorcycle motorcycle = new Motorcycle("Yamaha");

        System.out.println(car1.getType());
        car1.printBrand();
        car1.performMaintenance();

        System.out.println(motorcycle.getType());
        motorcycle.printBrand();
        motorcycle.performMaintenance();


    }
}
