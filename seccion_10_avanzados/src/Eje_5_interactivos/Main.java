package Eje_5_interactivos;

public class Main {
    public static void main(String[] args) {
        Boton boton = new Boton();
        ControlDeslizable control = new ControlDeslizable();

        boton.hacerClick();
        boton.arrastrar();

        control.arrastrar();
    }
}
