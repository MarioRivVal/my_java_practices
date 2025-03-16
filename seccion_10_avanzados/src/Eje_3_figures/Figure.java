package Eje_3_figures;


abstract public class Figure {

    protected double x;
    protected double y;

    public Figure(double x, double y){
        this.x = x;
        this.y= y;
    }

    public abstract double calculateArea();

    // dx : direction X, dy: direction Y
    public void move(double dx, double dy){
        this.x +=dx;
        this.y +=dy;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }


}
