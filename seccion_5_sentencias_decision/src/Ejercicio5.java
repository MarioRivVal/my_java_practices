import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){

        var console = new Scanner(System.in);

        final int DAILY_STEP_GOAL = 10000;
        final double CALORIES_PER_STEP = 0.04;
        String userName, goalAchieved;
        int userDailySteps;
        double totalCaloriesBurned;


        System.out.print("Username? ");
        userName = console.nextLine();

        System.out.print("How many steps did you take today? ");
        userDailySteps = Integer.parseInt(console.nextLine());

        totalCaloriesBurned = userDailySteps * CALORIES_PER_STEP;
        goalAchieved = userDailySteps >= DAILY_STEP_GOAL ? "Yes 😁💪" : "No 😥👎";

        System.out.printf("""
                %n-----------------------
                Username: %s
                Your steps today: %d steps
                Burned calories: %.2f kcal
                Goal achieved? %s
                -----------------------
                The daily goal is %d
                
                """, userName, userDailySteps, totalCaloriesBurned,goalAchieved, DAILY_STEP_GOAL);
    }
}
