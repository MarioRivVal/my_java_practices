public class Ejercicio2 {
    public static void main(String[] args) {
        String name = "Mario";
        String surname ="Rivera";

        var nameFirstLetter = name.substring(0,1).toLowerCase();
        var capitalSurname = surname.toUpperCase();

        String alias = nameFirstLetter.concat(capitalSurname);
        System.out.println(alias);
    }
}
