package Ejercicio_5;

public class TestAnimal {

    // POLYMORPHIC METHOD
    static void printSound(Animal animal) {
        animal.makeSound();
    }

    public static void main(String[] args) {

        Animal animal1 = new Animal("Yogui");
        Animal dog1 = new Dog("Pinky");
        Animal cat1 = new Cat("Garfield");

        Animal[] allAnimals = {animal1, dog1, cat1};

        for (Animal animal : allAnimals) {
            printSound(animal);
        }
    }
}
