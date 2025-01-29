import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter three numbers between 1 and 6: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (areLessThan1(num1, num2, num3) || areHigherThan6(num1, num2, num3)) {
            System.out.println("Error: Numbers must be between 1 and 6.");
            return;  
        }

        int sumNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;


        System.out.println("You rolled: " + roll1 + ", " + roll2 + ", " + roll3);
        System.out.println("You chose: " + num1 + ", " + num2 + ", " + num3);

        if (userWon(sumNumbers, sumDiceRolls)) {
            System.out.println("\nCongratulations, you won!");

        } else {
            System.out.println("\nBetter luck next time!");
        }

        scanner.close();
    }

    public static boolean areLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean areHigherThan6(int num1, int num2, int num3) {  
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 5);
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;  // 0 - 5.9999999
        randomNumber += 1;                        // 1 - 6.999999
        return (int) randomNumber;                // 1 - 6 (after casting)
    }
}
