package Eje_4_devices;

public class Router implements Conectable{

    @Override
    public void conectar() {
        System.out.println("Router conectado");
    }

    @Override
    public void desconectar() {
        System.out.println("Router desconectado");
    }
}
