package Eje_3_figures;

public class Circle extends Figure {

    private double radius;
    final double PI = 3.14;

    public Circle(double x, double y, double radius){
        super(x,y);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return PI * (this.radius * this.radius);
    };
}
