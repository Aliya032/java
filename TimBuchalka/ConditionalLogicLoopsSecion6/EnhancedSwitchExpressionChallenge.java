/*
- Create a method called printDayOfWeek, that takes an int parameter called day, but doesn't return any values.
- use enhanced switch statement, to return the name of the day, based on the parameter passed to the switch statement, so that 0 will return "Sunday" 1 will return "Monday" and so on. Any number not between 0 and 6 should return "Invalid Day" Note that return here means the value returned from the enhanced switch statement.
- use the name enhanced switch statement as an expression, returning the result to a String named dayOfTheWeek
- print both the day variable and the dayOfTheWeek variable.
 */

public class EnhancedSwitchExpressionChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(9);
    }
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch(day) {
            case 0-> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
}
