public class EmailDomainExtractor {
    public static void main(String[] args) {
        String email = "marioriveravalverde@netneoweb.com";
        
        String domain = email.substring(email.indexOf('@') +1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
}
