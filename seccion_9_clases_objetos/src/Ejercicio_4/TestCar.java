package Ejercicio_4;

public class TestCar {
    public static void main(String[] args) {

        Engine engine1 = new Engine(180);
        Engine engine2 = new Engine(220);
        Engine engine3 = new Engine(190);

        Car car1 = new Car("Jeep", "Wrangler", engine1, 60500.90);
        Car car2 = new Car("Porsce", "Carrera 910", engine2, 80900.50);
        Car car3 = new Car("BMW", "325 Sport", engine3, 45600.90);

        Car[] allCars = {car1, car2, car3};

        System.out.printf("The average oof cars is: %.2f%n", car1.calAverage(allCars));

        Car mostExpensive = car1.getMostExpensive(allCars);
        mostExpensive.printDetails();


    }
}
