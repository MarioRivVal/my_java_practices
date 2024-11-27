public class Ejercicio5 {
    public static void main(String[] args) {
        final float TASA_IVA = 0.16f;
        var precioBase = 120.0f;
        char moneda = '€';

        var precioTotal = precioBase + (precioBase * TASA_IVA);

        System.out.println("Precio base: " + precioBase + moneda);
        System.out.println("Tasa de IVA: " + TASA_IVA + moneda);
        System.out.println("Precio total: " + precioTotal + moneda);

    }
}
