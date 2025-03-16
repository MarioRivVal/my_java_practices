package Eje_4_devices;

public class Main {

    public static void main(String[] args) {

        Impresora  impresora = new Impresora();
        Router router = new Router();

        impresora.conectar();
        impresora.desconectar();

        router.conectar();
        router.desconectar();
    }
}
