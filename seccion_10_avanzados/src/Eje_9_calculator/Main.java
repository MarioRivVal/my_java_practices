package Eje_9_calculator;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        try {

            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the  numerator"));
            int den = Integer.parseInt(JOptionPane.showInputDialog("Enter the denominator"));

            if(den == 0){
                throw new ArithmeticException("Division by 0");
            }
            double result =  Calculator.divide(num, den);
            System.out.println(result);


        }catch (ArithmeticException e){
            System.err.println("Error: " + e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("Error, the input is not number");
        }
    }
}
