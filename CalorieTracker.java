package Challenge1;
import java.util.Scanner;

public class CalorieTracker {

    public static Scanner scanner = new Scanner(System.in);

    public static int day1CalConsumed, day1CalBurned;
    public static int day2CalConsumed, day2CalBurned;
    public static int day3CalConsumed, day3CalBurned;
    public static int day4CalConsumed, day4CalBurned;
    public static int day5CalConsumed, day5CalBurned;
    public static int day6CalConsumed, day6CalBurned;
    public static int day7CalConsumed, day7CalBurned;
    public static int totalCaloriesConsumed, totalCaloriesBurned;
    public static double averageCaloriesConsumed, averageCaloriesBurned;
    public static double netWeeklyPounds;


    public static void main(String[] args) {
        getUserInput();
        calculateCalories();
        displayCalories();

    }

    /*
    This method will get user's calories consumed and burned
    from days 1-7 and store it within variables
     */
    public static void getUserInput(){
        System.out.print("Enter calories consumed for day #1: ");
        day1CalConsumed = scanner.nextInt();
        System.out.print("Enter calories burned for day #1: ");
        day1CalBurned = scanner.nextInt();

        System.out.print("Enter calories consumed for day #2: ");
        day2CalConsumed = scanner.nextInt();
        System.out.print("Enter calories burned for day #2: ");
        day2CalBurned = scanner.nextInt();

        System.out.print("Enter calories consumed for day #3: ");
        day3CalConsumed = scanner.nextInt();
        System.out.print("Enter calories burned for day #3: ");
        day3CalBurned = scanner.nextInt();

        System.out.print("Enter calories consumed for day #4: ");
        day4CalConsumed = scanner.nextInt();
        System.out.print("Enter calories burned for day #4: ");
        day4CalBurned = scanner.nextInt();

        System.out.print("Enter calories consumed for day #5: ");
        day5CalConsumed = scanner.nextInt();
        System.out.print("Enter calories burned for day #5: ");
        day5CalBurned = scanner.nextInt();

        System.out.print("Enter calories consumed for day #6: ");
        day6CalConsumed = scanner.nextInt();
        System.out.print("Enter calories burned for day #6: ");
        day6CalBurned = scanner.nextInt();

        System.out.print("Enter calories consumed for day #7: ");
        day7CalConsumed = scanner.nextInt();
        System.out.print("Enter calories burned for day #7: ");
        day7CalBurned = scanner.nextInt();

    }

    /*
    This method will calculate all totals and averages
    using the information the user gave for calories
    consumed and burned
     */
    public static void calculateCalories(){
        totalCaloriesConsumed = day1CalConsumed + day2CalConsumed + day3CalConsumed +
                                day4CalConsumed + day5CalConsumed + day6CalConsumed +
                                day7CalConsumed;

        totalCaloriesBurned = day1CalBurned + day2CalBurned + day3CalBurned + day4CalBurned +
                            day5CalBurned + day6CalBurned + day7CalBurned;

        averageCaloriesConsumed = totalCaloriesConsumed / 7.0;
        averageCaloriesBurned = totalCaloriesBurned / 7.0;

        netWeeklyPounds = (totalCaloriesConsumed - totalCaloriesBurned) / 3000.0;

    }

    /*
    This method will display all information to the
    console when called
     */
    public static void displayCalories(){
        System.out.println("You consumed a total of " + totalCaloriesConsumed + " calories this week.");
        System.out.println("You burned a total of " + totalCaloriesBurned + " calories this week.");
        System.out.println();

        System.out.print("You consumed an average of ");
        System.out.printf("%.2f", averageCaloriesConsumed);
        System.out.println(" calories a day.");

        System.out.print("You burned an average of ");
        System.out.printf("%.2f", averageCaloriesBurned);
        System.out.println(" calories a day.");
        System.out.println();

        System.out.print("Your net weekly gain/loss was ");
        System.out.printf("%.3f", netWeeklyPounds);
        System.out.println(" pounds.");

    }
}
