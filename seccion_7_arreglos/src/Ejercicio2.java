public class Ejercicio2 {

    public static void main(String[] args) {

        int[][] myArray = {{10,20,30},{40,50,60},{70,80,90}};
        int total = 0;

        for (int col = 0; col < myArray.length; col++){

            for(int row = 0; row< myArray[col].length; row++){

                System.out.println("myArray[" + col + "][" + row + "] = " + myArray[col][row] );

                if(col == row){
                    total += myArray[col][row];
                }
            }

        }

        System.out.println("\nThe total for the cells with same index number is: " + total);
    }
}
