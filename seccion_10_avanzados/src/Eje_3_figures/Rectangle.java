package Eje_3_figures;

public class Rectangle extends Figure {
    private double width, height;

    public Rectangle (double x, double y, double width, double height){

        super(x,y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return this.width * this.height;
    }
}
