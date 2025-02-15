package Ejercicio_4;

public class Car {
    private String brand;
    private String model;
    private Engine engine;
    private Double price;

    public Car(String brand, String model, Engine engine, Double price) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.price = price;

    }

    public void printDetails() {
        System.out.println(model + " is a " + brand + " car, with " + engine.getPower() + " of power, and his price is " + price);
    }

    public double calAverage(Car[] arr) {
        double total = 0;
        for (Car car : arr) {
            total += car.price;
        }
        return total / arr.length;
    }

    public Car getMostExpensive(Car[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("The array cannot be null or empty");
        }

        Car expensiveOne = arr[0];

        for (Car car : arr) {
            if (car.price > expensiveOne.price) {
                expensiveOne = car;
            }
        }
        return expensiveOne;
    }
}
