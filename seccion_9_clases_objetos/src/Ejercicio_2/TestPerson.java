package Ejercicio_2;

public class TestPerson {
    public static void main(String[] args) {

        Person user1 = new Person("Roberto", 30);

        user1.printInfo();

        user1.setAge(32);
        System.out.println(user1.getAge());

        user1.setName("Mario");
        System.out.println(user1.getName());

        user1.printInfo();
    }
}
