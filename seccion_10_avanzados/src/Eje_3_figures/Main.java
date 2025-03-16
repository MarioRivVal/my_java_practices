package Eje_3_figures;

public class Main {

    public static void main(String[] args) {

        Figure circle1 = new Circle(1, 2, 10);
        Figure rectangle1 = new Rectangle(1.5, 2, 30, 60);

        System.out.println("The area of the rectangle: " + circle1.calculateArea());
        System.out.println("The area of the circle: " + rectangle1.calculateArea());

        System.out.println("\nThe coordinates of the circle BEFORE moving are x: " + circle1.getX() + " and y: " + circle1.getY());
        circle1.move(2.2, -3);
        System.out.println("The coordinates of the circle AFTER moving are x: " + circle1.getX() + " and y: " + circle1.getY());

    }
}
