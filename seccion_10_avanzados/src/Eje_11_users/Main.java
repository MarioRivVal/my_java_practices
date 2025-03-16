package Eje_11_users;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Mario","info@netneo.es", 36 );

        try {
            UserValidator.validateUser(user1);
            System.out.println("User saved");
        } catch (NameInvalidException | AgeInvalidException | EmailInvalidException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exiting from App");
        }
    }
}
