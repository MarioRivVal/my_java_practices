public class Ejercicio5 {
    public static void main(String[] args) {
        String name = "Mario Rivera Valverde";
        String company = "Netneoweb";
        String domain = "com";

        String formattedName = name.replaceAll(" ","").toLowerCase();
        String formattedCompany = company.replaceAll(" ","").toLowerCase();

        var email = new StringBuilder();
        email.append(formattedName).append('@').append(formattedCompany).append(".").append(domain);
        System.out.println(email.toString());
    }
}
