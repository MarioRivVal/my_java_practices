package Eje_4_devices;

public class Impresora implements Conectable{

    @Override
    public void conectar() {
        System.out.println("Impresora conectada");
    }

    @Override
    public void desconectar() {
        System.out.println("Impresora desconectada");
    }
}
