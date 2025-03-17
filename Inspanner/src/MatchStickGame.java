/* write a program for a matchstick game being played between the computer and the user. your program should ensure that the computer always wins.
Rules are as follows:
1. there are 21 matchsticks
2. the computer asks the player to pick 1,2,3, or 4 matchsticks
3. after the person picks, the computer does its picking
4. whoever is forced to pick up the last matchstick loses the game.
*/

import java.util.Scanner;

public class MatchStickGame {
    public static void main(String[] args) {
        int totalSticks = 21;
        Scanner myscan = new Scanner(System.in);
        System.out.println("Pick 1, 2, 3 or 4 matchsticks.");
        int userInput = myscan.nextInt();
        if (userInput > 4 ||userInput < 1) {
            System.out.println("Invalid input");
        }
        int compInput = 5 - userInput;
        totalSticks -= (userInput + compInput);
        System.out.println("Computer chose: " + compInput + " Sticks left: "+ totalSticks);
        for (int i = 1; i<= totalSticks; i++) {
            System.out.println("Pick 1, 2 3 or 4 matchsticks: ");
            int userInput2 = myscan.nextInt();
            if (userInput2 > 4 || userInput2 <1) {
                System.out.println("Invalid input");
            }
            int compInput2 = 5 - userInput2;
            totalSticks -= userInput2 + compInput2;
            System.out.println("Computer chose: " + compInput2 + " Sticks left: "+ totalSticks);
            if (totalSticks == 1) {
                System.out.println("You are last to pick, you lose.");
            }
        }
    }
}
