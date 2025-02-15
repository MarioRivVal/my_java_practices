package Ejercicio_3;

public class TestCar {

    public static void main(String[] args) {

        Engine engine1 = new Engine(180);

        Car car1 = new Car("Jeep", "Wrangler", engine1);

        car1.printDetails();
    }
}
