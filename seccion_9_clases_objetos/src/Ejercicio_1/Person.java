package Ejercicio_1;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(name + " is " + age + " years old");
    }
}
