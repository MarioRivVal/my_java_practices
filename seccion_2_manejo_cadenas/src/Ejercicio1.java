public class Ejercicio1 {
    public static void main(String[] args) {
        String fullName = "Mario Rivera Valverde";

        var name = fullName.substring(0, fullName.indexOf(" "));
        var surnames = fullName.substring(fullName.indexOf(" ")).trim();

        String fullNameNewFormat = String.join(", ", surnames, name);
        System.out.println(fullNameNewFormat);

    }
}
