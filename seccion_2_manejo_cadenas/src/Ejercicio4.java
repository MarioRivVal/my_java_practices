public class Ejercicio4 {
    public static void main(String[] args) {
        String paragraph = " NETNEOWEB es la MEJOR  agencia de Desarrollo Web ";

        String newParagraph = paragraph.replaceAll("\\s+", " ").trim().toLowerCase();

        var firstLetter = newParagraph.substring(0,1).toUpperCase();

        String correctParagraph = firstLetter.concat(newParagraph.substring(1));
        System.out.println(correctParagraph);

    }
}
