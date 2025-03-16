package Eje_5_interactivos;

public class Boton implements Arrastrable, Clickeable {

    @Override
    public void arrastrar() {
        System.out.println("Botón arrastrado");
    }

    @Override
    public void hacerClick() {
        System.out.println("Botón clicado");
    }
}
