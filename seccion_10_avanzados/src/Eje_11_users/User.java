package Eje_11_users;

public class User {

    private String name, email;
    private int age;

    public User(String name, String email, int age){
        this.name= name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}
